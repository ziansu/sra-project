@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    setContentView(R.layout.main);
    tv = ((android.widget.TextView) (findViewById(R.id.tv)));
    handel = new android.os.Handler();
    fetcher = new java.lang.Thread(fetcherRunnable);
    sender = new java.lang.Thread(senderRunnable);
    datasource = new ir.sobhe.smsd.MessagesDataSource(this);
    datasource.open();
}