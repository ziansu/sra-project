private void nonvalid() {
    if (valid[0]) {
        int top = item.getAbsoluteTop();
        com.google.gwt.user.client.Window.scrollTo(0, ((top - 85) >= 0 ? top - 85 : 0));
        item.focus();
        valid[0] = false;
    }
}