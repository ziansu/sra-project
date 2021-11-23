@java.lang.SuppressWarnings(value = "unchecked")
private static void init() {
    if ((com.smilehacker.lego.LegoAdapter.legoFactory) == null) {
        java.lang.Class factoryClass;
        try {
            factoryClass = java.lang.Class.forName("com.smilehacker.lego.LegoFactory");
            java.lang.reflect.Constructor<?> constructor = factoryClass.getDeclaredConstructor();
            com.smilehacker.lego.LegoAdapter.legoFactory = ((com.smilehacker.lego.ILegoFactory) (constructor.newInstance()));
        } catch (java.lang.Exception e) {
            android.util.Log.e(com.smilehacker.lego.LegoAdapter.TAG, "method error", e);
        }
    }
}