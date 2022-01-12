private static void startOfficeManager() {
    if ((org.zenframework.z8.server.base.file.FileConverter.officeManager) == null) {
        try {
            org.zenframework.z8.server.base.file.FileConverter.officeManager = new org.artofsolving.jodconverter.office.DefaultOfficeManagerConfiguration().setOfficeHome(org.zenframework.z8.server.engine.Z8Context.getConfig().getOfficeHome()).setPortNumber(org.zenframework.z8.server.base.file.FileConverter.OFFICE_PORT).buildOfficeManager();
            org.zenframework.z8.server.base.file.FileConverter.officeManager.start();
        } catch (java.lang.Throwable e) {
            org.zenframework.z8.server.base.file.FileConverter.LOG.error("Could not start office manager", e);
        }
    }
}