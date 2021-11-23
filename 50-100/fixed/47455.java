@android.annotation.SuppressLint(value = "NewApi")
@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    v = new android.widget.ImageButton(this);
    v.setOnClickListener(this);
    v.setScaleType(ScaleType.FIT_XY);
    try {
        java.lang.String pth = "/sdcard/gifs/piggy.gif";
        final java.io.InputStream stream = new java.io.BufferedInputStream(new java.io.FileInputStream(pth), 16356041);
        drw = new pl.droidsonroids.gif.GifDrawable(pth);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    v.setImageDrawable(drw);
    setContentView(v);
}