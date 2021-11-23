@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    randomiseFortune();
    android.content.res.AssetManager am = this.getAssets();
}