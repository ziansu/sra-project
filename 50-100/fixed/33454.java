@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = android.databinding.DataBindingUtil.setContentView(this, R.layout.activity_main);
    if ((android.os.Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M))
        setPackage();
    
    setDefault();
    startService(new android.content.Intent(this, kr.edcan.neologism.utils.ClipBoardService.class));
    kr.edcan.neologism.utils.DBSync.syncDB();
}