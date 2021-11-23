private static java.io.File getProjectFile(final java.io.File directory) {
    java.io.File[] files = directory.listFiles(new java.io.FilenameFilter() {
        @java.lang.Override
        public boolean accept(java.io.File dir, java.lang.String name) {
            return (name.toLowerCase().endsWith(org.epsg.openconfigurator.wizards.ImportOpenConfiguratorProjectWizardPage.XML_EXTENSION_LABEL)) && (!(name.equalsIgnoreCase(org.epsg.openconfigurator.wizards.ImportOpenConfiguratorProjectWizardPage.XAP_XML_LABEL)));
        }
    });
    if ((files != null) && ((files.length) > 0)) {
        return files[0];
    }
    return null;
}