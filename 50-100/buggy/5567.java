@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    progressBar = ((android.widget.ProgressBar) (findViewById(R.id.progress_bar)));
    startScanningButton = ((android.widget.Button) (findViewById(R.id.start_scanning_button)));
    adapter = new com.joss.microchipmastersandroid.activities.MainActivity.BleAdapter(this);
    listView = ((android.widget.ListView) (findViewById(R.id.list_view)));
    listView.setAdapter(adapter);
    bleConnection = new com.joss.microchipmastersandroid.activities.MainActivity.MicrochipBleConnection();
}