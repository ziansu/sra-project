@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    nu.nldv.uppackaren.UppackarenApplication.getEventBus().register(this);
    handler = new android.os.Handler(android.os.Looper.getMainLooper());
}