public void createSourceZIP() throws java.io.IOException {
    java.lang.String fileName = ((("eexcess-partner-" + (this.artifactId)) + "-") + (this.version)) + ".war";
    try {
        zipDir((((eu.eexcess.partnerrecommender.Bean.PATH_BUILD_SANDBOX) + fileName) + ".zip"), ((eu.eexcess.partnerrecommender.Bean.PATH_BUILD_SANDBOX) + (this.artifactId)));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}