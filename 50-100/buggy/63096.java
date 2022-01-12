@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    imageView = ((android.widget.ImageView) (findViewById(R.id.imageView)));
    final cn.jack.permissionmanager.PermissionManager permissionManager = new cn.jack.permissionmanager.PermissionManager(this, listener);
    findViewById(R.id.permissionButtion).setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            permissionManager.requestPermission(Manifest.permission.READ_PHONE_STATE, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.CAMERA);
        }
    });
}