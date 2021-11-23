@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.sign_layout);
    page1 = findViewById(R.id.MyFlipper_page01);
    page2 = findViewById(R.id.MyFlipper_page02);
    viewFlipper = ((android.widget.ViewFlipper) (findViewById(R.id.vfSign)));
    viewFlipper.setDisplayedChild(0);
    viewFlipper.addOnLayoutChangeListener(onLayoutChangeListener_viewFlipper);
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    drawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
}