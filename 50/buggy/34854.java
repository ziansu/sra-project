@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initializeComponents();
    processLoginIfTokenExists();
    android.util.Log.d("Chooser", "Login loaded");
}