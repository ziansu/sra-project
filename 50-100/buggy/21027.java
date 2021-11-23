@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    if (!(hasRecordAudioPermission()))
        requestRecordAudioPermission();
    else
        bindAudioRecord();
    
    if (!(hasWriteExternalStoragePermission()))
        requestWriteExternalStoragePermission();
    
}