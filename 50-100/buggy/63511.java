@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.popup_main);
    android.util.DisplayMetrics disMet = new android.util.DisplayMetrics();
    getWindowManager().getDefaultDisplay().getMetrics(disMet);
    int width = disMet.widthPixels;
    int height = disMet.heightPixels;
    getWindow().setLayout(((int) (width * 1)), ((int) (height * 1)));
}