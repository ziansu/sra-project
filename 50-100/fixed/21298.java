net.sf.launch4j.config.Msg toL4j() {
    net.sf.launch4j.config.Msg ret = new net.sf.launch4j.config.Msg();
    ret.setStartupErr(startupErr);
    ret.setBundledJreErr(bundledJreErr);
    ret.setJreVersionErr(jreVersionErr);
    ret.setLauncherErr(launcherErr);
    ret.setInstanceAlreadyExistsMsg(instanceAlreadyExistsMsg);
    return ret;
}