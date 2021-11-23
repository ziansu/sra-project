@java.lang.Override
public void onCreate(@org.jetbrains.annotations.Nullable
final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ru.hypernavi.client.app.AppActivity.LOG.info("onCreate start");
    setContentView(R.layout.main);
    final java.util.Properties properties = loadProperties(ru.hypernavi.client.app.AppActivity.PROPERTIES_SCHEME);
    executeProperties(properties);
    executorService = java.util.concurrent.Executors.newFixedThreadPool(nThread);
    final android.widget.ImageView imageView = ((android.widget.ImageView) (findViewById(R.id.imageView)));
    getParametersDisplay();
    drawDisplayImage(imageView);
    registerGPSListeners(imageView);
    registerZoomListeners(imageView);
    registerTouchListeners(imageView);
}