public java.lang.String getCurrentSSID() {
    if ((this.currentSSID) == null) {
        java.lang.String[] output = org.area515.util.IOUtilities.executeNativeCommand(new java.lang.String[]{ "iwgetid" , "-r" }, null, ((java.lang.String) (null)));
        org.area515.resinprinter.network.LinuxNetworkManager.currentSSID = output[0];
    }
    return org.area515.resinprinter.network.LinuxNetworkManager.currentSSID;
}