@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_page);
    android.support.design.widget.BottomNavigationView navigation = ((android.support.design.widget.BottomNavigationView) (findViewById(R.id.navigation)));
    navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    PhotoCash.photoCash = new java.util.HashMap<java.lang.String, android.graphics.Bitmap>();
    android.widget.FrameLayout frameLayout = ((android.widget.FrameLayout) (findViewById(R.id.frame_view)));
    com.vk.sdk.VKSdk.login(this, scope);
    dialogFragment = new com.example.nickolas.vknick.com.example.nickolas.vknick.DialogFragment();
    dialogFragment.dialogModel = new com.example.nickolas.vknick.DialogModel();
}