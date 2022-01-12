private void refresh(boolean rebuild) {
    if (((combo) != null) && (!(combo.isDisposed()))) {
        refreshCombo(rebuild);
    }
    if (((fMenu) != null) && (!(fMenu.isDisposed()))) {
        refreshMenu(rebuild);
    }
}