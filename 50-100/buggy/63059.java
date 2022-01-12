public org.jodconverter.office.DefaultOfficeManager.Builder processManager(final java.lang.String processManagerClass) {
    if (org.apache.commons.lang3.StringUtils.isNotBlank(processManagerClass)) {
        try {
            this.processManager = ((org.jodconverter.process.ProcessManager) (java.lang.Class.forName(processManagerClass).newInstance()));
        } catch (java.lang.InstantiationException | java.lang.IllegalAccessException | java.lang.ClassNotFoundException ex) {
            throw new java.lang.IllegalArgumentException(("Unable to create a Process manager from the specified class name: " + processManagerClass), ex);
        }
    }
    return this;
}