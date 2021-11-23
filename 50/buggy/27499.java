public java.lang.String mayClose() {
    if (((this.action) == (NavigationAction.ADD)) && (!(added))) {
        return Utils.messages.detailsMayCloseMessage(field.getDisplayName());
    }
    return null;
}