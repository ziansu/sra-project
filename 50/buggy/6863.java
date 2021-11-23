@java.lang.Override
public void disposeComponent() {
    getCamelIdeaService(project).setCamelPresent(false);
    getCamelIdeaService(project).clearLibraries();
    getCamelCatalogService(project).clearLoadedVersion();
    runModuleOnStartUp = false;
}