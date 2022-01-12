public void deploySlug(java.lang.String slugFilename, java.util.Map<java.lang.String, java.lang.String> processTypes, java.util.Map<java.lang.String, java.lang.String> configVars, java.lang.String stack) throws java.lang.Exception {
    com.heroku.sdk.deploy.SlugDeployer slugDeployer = new com.heroku.sdk.deploy.SlugDeployer(deployer.getBuildPackDesc(), name, getRootDir(), deployer.getTargetDir(), this);
    slugDeployer.deploySlug(slugFilename, processTypes, configVars, stack);
}