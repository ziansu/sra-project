public void deploy() {
    com.openshift.client.ApplicationScale scale1 = com.openshift.client.ApplicationScale.NO_SCALE;
    com.openshift.client.cartridge.IStandaloneCartridge car1 = com.openshift.client.cartridge.query.LatestVersionOf.jbossAs().get(user);
    com.openshift.client.cartridge.StandaloneCartridge cartridge = new com.openshift.client.cartridge.StandaloneCartridge(getEntity().getCartridge());
    deployedApp = new com.openshift.client.ApplicationBuilder(domain).setName(applicationName).setStandaloneCartridge(cartridge).setApplicationScale(scale1).setInitialGitUrl(gitRepositoryUrl).build();
}