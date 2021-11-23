@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    setTheme(droidninja.filepicker.PickerManager.getInstance().getTheme());
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_file_picker);
    droidninja.filepicker.utils.image.FrescoManager.init(this);
    if (savedInstanceState == null) {
        initView();
    }
}