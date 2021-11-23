public static void init(android.content.Context context) {
    try {
        java.lang.Class.forName("com.koushikdutta.ion.Ion");
        com.egame.proxy.support.ion.IonProxy.doInit(context);
    } catch (java.lang.ClassNotFoundException e) {
        android.util.Log.d(ProxyUtil.TAG, "Ion is invalid");
    }
}