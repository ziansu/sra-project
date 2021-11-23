private java.util.ArrayList<org.rstudio.studio.client.common.dependencies.model.Dependency> dataImportMongoDependencies() {
    java.util.ArrayList<org.rstudio.studio.client.common.dependencies.model.Dependency> deps = new java.util.ArrayList<org.rstudio.studio.client.common.dependencies.model.Dependency>();
    deps.add(org.rstudio.studio.client.common.dependencies.model.Dependency.cranPackage("mongolite", "0.8"));
    deps.add(org.rstudio.studio.client.common.dependencies.model.Dependency.cranPackage("jsonlite", "0.9.16"));
    return deps;
}