@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_third);
    net.masonliu.statusbarcolor.StatusBarColorUtil.setStatusBarColorResourceAfterSetContentView(this, R.color.red);
    net.masonliu.statusbarcolor.StatusBarColorUtil.setNavigationBarColorResourceAfterSetContentView(this, R.color.red);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.home_activity_toolbar)));
    setSupportActionBar(toolbar);
    android.widget.Toast.makeText(this, "dd3", Toast.LENGTH_LONG).show();
}