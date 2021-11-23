public org.jolokia.docker.maven.config.BuildImageConfiguration.Builder runCmds(java.util.List<java.lang.String> theCmds) {
    if ((config.runCmds) == null) {
        config.runCmds = new java.util.ArrayList<java.lang.String>();
    }else
        config.runCmds = theCmds;
    
    return this;
}