private boolean checkMasterAddress() {
    java.net.InetSocketAddress masterAddress = FileSystemContext.INSTANCE.getMasterAddress();
    boolean sameHost = masterAddress.getHostString().equals(mUri.getHost());
    boolean samePort = (masterAddress.getPort()) == (mUri.getPort());
    if (sameHost && samePort) {
        return true;
    }
    return false;
}