private void generateControllerSource(com.sun.codemodel.JCodeModel codeModel, com.phoenixnap.oss.ramlapisync.data.ApiResourceMetadata met, java.io.File dir) {
    if (codeModel == null) {
        codeModel = new com.sun.codemodel.JCodeModel();
    }
    loadRule().apply(met, codeModel);
    try {
        codeModel.build(dir);
    } catch (java.io.IOException e) {
        e.printStackTrace();
        this.getLog().error(("Could not build code model for " + (met.getName())), e);
    }
}