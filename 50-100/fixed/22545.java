@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    nickrout.lenslauncher.util.ObservableObject.getInstance().addObserver(this);
    mLensView = ((nickrout.lenslauncher.ui.LensView) (findViewById(R.id.lens_view_apps)));
    loadApps(true);
}