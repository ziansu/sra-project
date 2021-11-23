public static org.openl.extension.xmlrules.ProjectData getCurrentInstance() {
    org.openl.extension.xmlrules.ProjectData projectData = org.openl.extension.xmlrules.ProjectData.INSTANCE.get();
    if (projectData == null) {
        projectData = new org.openl.extension.xmlrules.ProjectData();
        org.openl.extension.xmlrules.ProjectData.INSTANCE.set(projectData);
    }
    return projectData;
}