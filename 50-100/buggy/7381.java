private void addPorts(java.lang.StringBuilder b) {
    if ((ports.size()) > 0) {
        java.lang.String[] portsS = new java.lang.String[ports.size()];
        int i = 0;
        for (java.lang.String port : portsS) {
            portsS[(i++)] = validatePortExposure(port);
        }
        DockerFileKeyword.EXPOSE.addTo(b, portsS);
    }
}