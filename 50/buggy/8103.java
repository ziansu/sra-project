@java.lang.Override
protected void execAction() {
    try {
        this.changeDatesNext();
        this.reloadMenus(this.getSelectedRow());
    } catch (final java.io.IOException e) {
        throw new org.eclipse.scout.rt.platform.exception.VetoException("Canno't get calendar details, re-try later");
    }
}