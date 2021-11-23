public static synchronized com.example.ajinkya.stayhealthysg.MySingleton getInstance(android.content.Context context) {
    if ((com.example.ajinkya.stayhealthysg.MySingleton.mInstance) == null) {
        com.example.ajinkya.stayhealthysg.MySingleton.mInstance = new com.example.ajinkya.stayhealthysg.MySingleton(context);
    }
    return com.example.ajinkya.stayhealthysg.MySingleton.mInstance;
}