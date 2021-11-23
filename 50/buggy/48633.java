public void onHotKey(com.tulskiy.keymaster.common.HotKey hotKey) {
    if (isShown) {
        raise(new seedu.address.commons.events.ui.HideWindowEvent());
    }else {
        raise(new seedu.address.commons.events.ui.ShowWindowEvent());
        isShown = true;
    }
}