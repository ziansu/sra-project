@java.lang.Override
public void onCreate() {
    super.onCreate();
    initMapzip(true);
    initFabric();
    com.mapzip.ppang.mapzipproject.adapter.MapzipApplication.setDefaultFont(this, "DEFAULT", "default_font2.ttf");
    com.mapzip.ppang.mapzipproject.adapter.MapzipApplication.setDefaultFont(this, "SANS_SERIF", "default_font2.ttf");
    com.mapzip.ppang.mapzipproject.adapter.MapzipApplication.setDefaultFont(this, "SERIF", "default_font2.ttf");
}