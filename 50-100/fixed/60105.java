public void setFileStem(java.lang.String fileStem) {
    this.outDir = fileStem;
    this.fileStem = fileStem;
    this.propertiesFile = ((((((root) + (java.io.File.separator)) + (id)) + (java.io.File.separator)) + fileStem) + (java.io.File.separator)) + (modelFile.replace(".xml", ".properties"));
}