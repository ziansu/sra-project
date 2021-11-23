private void initGui() {
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
    navView.setNavigationItemSelectedListener(this);
    navView.getMenu().getItem(0).setChecked(true);
    android.widget.LinearLayout navHeader = ((android.widget.LinearLayout) (navView.getHeaderView(0)));
    navHeader.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            showFragment(R.id.action_settings);
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    });
}