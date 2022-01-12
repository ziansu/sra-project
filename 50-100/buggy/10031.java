public void execute(java.lang.String goal, java.lang.String pathToPom) {
    java.lang.System.setProperty("maven.multiModuleProjectDirectory", pathToPom);
    org.apache.maven.cli.MavenCli cli = new org.apache.maven.cli.MavenCli();
    cli.doMain(new java.lang.String[]{ "clean" , goal }, pathToPom, java.lang.System.out, java.lang.System.err);
}