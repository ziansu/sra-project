protected void createSlug(java.lang.String slugFilename, java.util.List<java.io.File> includedFiles, java.lang.String jdkVersion, java.net.URL jdkUrl, java.lang.String stack) throws java.lang.Exception {
    com.heroku.sdk.deploy.SlugDeployer slugDeployer = new com.heroku.sdk.deploy.SlugDeployer(deployer.getBuildPackDesc(), name, getRootDir(), deployer.getTargetDir(), this);
    prepare(includedFiles, new java.util.HashMap<java.lang.String, java.lang.String>());
    slugDeployer.createSlug(slugFilename, jdkVersion, jdkUrl, stack);
}