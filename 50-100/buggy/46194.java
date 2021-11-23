@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.splash);
    android.view.SurfaceView v = ((android.view.SurfaceView) (findViewById(R.id.surfaceView1)));
    gif.decoder.GifRun w = GifRun();
    w.LoadGiff(v, this, R.drawable.giphy);
}