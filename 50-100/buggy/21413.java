@java.lang.Override
protected void onCreate(final android.os.Bundle savedInstanceState) {
    try {
        super.onCreate(savedInstanceState);
        boolean isRunIntro = getIntent().getBooleanExtra("intro", true);
        if (isRunIntro) {
            beforeIntro();
        }else {
            afterIntro(savedInstanceState);
        }
        setMetaInfo("userNo", "20");
        setMetaInfo("userID", "user20");
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        android.util.Log.e("error", ex.getMessage());
    }
}