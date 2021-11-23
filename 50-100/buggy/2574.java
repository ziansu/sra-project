private java.lang.String getMacAddr() {
    android.os.IBinder b = android.os.ServiceManager.getService(Context.NETWORKMANAGEMENT_SERVICE);
    android.os.INetworkManagementService networkManagement = INetworkManagementService.Stub.asInterface(b);
    if (networkManagement != null) {
        android.net.InterfaceConfiguration iconfig = null;
        try {
            iconfig = networkManagement.getInterfaceConfig("eth0");
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        } finally {
            return (iconfig.hwAddr) != null ? iconfig.hwAddr : "";
        }
    }else {
        return "";
    }
}