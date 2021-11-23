public void closeSingleton() {
    com.example.zoardgeocze.clickonmap.Singleton.SingletonFacadeController.INSTANCE = null;
    java.lang.System.gc();
    android.util.Log.d("Teste", "Matei singleton");
}