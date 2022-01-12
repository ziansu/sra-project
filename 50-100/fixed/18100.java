public void setNetworks(java.lang.String[] args) {
    networkFiles = new java.util.ArrayList<java.io.File>();
    networkURLs = new java.util.ArrayList<java.net.URL>();
    for (java.lang.String name : args) {
        try {
            if (name.matches(StreamUtil.URL_PATTERN))
                networkURLs.add(new java.net.URL(name));
            else
                networkFiles.add(new java.io.File(name));
            
        } catch (java.lang.Exception e) {
            org.cytoscape.cmdline.gui.internal.StartupConfig.logger.error(e.toString());
        }
    }
    taskStart = true;
}