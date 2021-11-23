public org.talend.core.model.general.ModuleNeeded.ELibraryInstallStatus getDeployStatus() {
    java.lang.String mvnUriStatusKey = getMavenUri(true);
    final org.talend.core.model.general.ModuleNeeded.ELibraryInstallStatus eLibraryDeployStatus = org.talend.core.model.general.ModuleStatusProvider.getDeployStatusMap().get(mvnUriStatusKey);
    if (eLibraryDeployStatus != null) {
        return eLibraryDeployStatus;
    }else
        if (mvnUriStatusKey != null) {
            resolveStatusLocally(mvnUriStatusKey);
        }
    
    return this.installStatus;
}