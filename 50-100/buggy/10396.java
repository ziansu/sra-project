@java.lang.Override
protected void execLoadSession() throws org.eclipse.scout.commons.exception.ProcessingException {
    java.lang.Boolean createTunnelToServerBeans = org.eclipse.scout.rt.platform.config.CONFIG.getPropertyValue(org.eclipse.scout.rt.shared.SharedConfigProperties.CreateTunnelToServerBeansProperty.class);
    if (!createTunnelToServerBeans) {
        org.eclipsescout.demo.widgets.client.ClientSession.logger.info("starting client without a server!");
    }
    org.eclipse.scout.rt.shared.services.common.code.CODES.getAllCodeTypes("org.eclipsescout.demo.widgets.shared");
    setLocale(java.util.Locale.ENGLISH);
    setDesktop(new org.eclipsescout.demo.widgets.client.ui.desktop.Desktop());
    if (createTunnelToServerBeans) {
        org.eclipse.scout.rt.platform.BEANS.get(org.eclipse.scout.rt.client.services.common.bookmark.IBookmarkService.class).loadBookmarks();
        org.eclipse.scout.rt.platform.BEANS.get(org.eclipse.scout.rt.shared.services.common.ping.IPingService.class).ping("ping");
    }
}