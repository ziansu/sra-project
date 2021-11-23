public static void injectPagedTableResources() {
    org.rstudio.studio.client.workbench.views.source.editors.text.ChunkDataWidget.injectStyleElement("rmd_data/pagedtable.css", "pagedtable-css");
    com.google.gwt.core.client.ScriptInjector.fromUrl("rmd_data/pagedtable.js").inject();
}