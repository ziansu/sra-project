@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_menu);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    toolbar.setTitle(R.string.app_name);
    java.io.File fileItems = new java.io.File(((getExternalFilesDir(null)) + "/items.txt"));
    java.io.File fileData = new java.io.File(((getExternalFilesDir(null)) + "/data.txt"));
}