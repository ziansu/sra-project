public void uninstall() {
    try {
        rkey.deleteSubKey("ES2K");
    } catch (com.ice.jni.registry.RegistryException e) {
        e.printStackTrace();
        new kaaass.es2k.crashreport.ErrorUtil(e).dealWithException();
    }
}