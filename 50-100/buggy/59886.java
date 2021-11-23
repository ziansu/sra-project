private java.util.ArrayList<org.rstudio.studio.client.common.dependencies.model.Dependency> dataImportSavDependencies() {
    java.util.ArrayList<org.rstudio.studio.client.common.dependencies.model.Dependency> deps = new java.util.ArrayList<org.rstudio.studio.client.common.dependencies.model.Dependency>();
    deps.add(org.rstudio.studio.client.common.dependencies.model.Dependency.cranPackage("haven", "0.2.0"));
    deps.add(org.rstudio.studio.client.common.dependencies.model.Dependency.cranPackage("Rcpp", "0.11.4"));
    deps.add(org.rstudio.studio.client.common.dependencies.model.Dependency.cranPackage("jsonlite", "0.9.16"));
    return deps;
}