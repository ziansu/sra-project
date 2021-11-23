public java.lang.Boolean getNsIsSDFProject() {
    java.lang.Boolean isNSSDFProject = propertiesComponent.getBoolean(PROJECT_SETTING_NETSUITE_IS_SDF);
    isNSSDFProject = (isNSSDFProject == null) ? false : true;
    return isNSSDFProject;
}