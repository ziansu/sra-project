public static synchronized void initialize(com.cookpad.android.puree.PureeConfiguration conf) {
    if (com.cookpad.android.puree.Puree.isInitialized) {
        android.util.Log.w(com.cookpad.android.puree.Puree.TAG, "Puree has already initialized");
        return ;
    }
    com.cookpad.android.puree.Puree.gson = conf.getGson();
    com.cookpad.android.puree.Puree.storage = new com.cookpad.android.puree.storage.PureeDbHelper(conf.getApplicationContext());
    for (com.cookpad.android.puree.outputs.PureeOutput output : conf.getOutputs()) {
        output.initialize(com.cookpad.android.puree.Puree.storage);
        com.cookpad.android.puree.Puree.outputMap.put(output.type(), output);
    }
    com.cookpad.android.puree.Puree.isInitialized = true;
}