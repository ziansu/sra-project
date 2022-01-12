net.sf.launch4j.config.Msg toL4j() {
    com.akathist.maven.plugins.launch4j.Msg ret = new com.akathist.maven.plugins.launch4j.Msg();
    ret.setStartupErr(startupErr);
    ret.setBundledJreErr(bundledJreErr);
    ret.setJreVersionErr(jreVersionErr);
    ret.setLauncherErr(launcherErr);
    ret.setInstanceAlreadyExistsMsg(instanceAlreadyExistsMsg);
    return ret;
}