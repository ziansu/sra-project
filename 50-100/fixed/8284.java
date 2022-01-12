private void bindData() {
    android.support.design.widget.NavigationView navigationView = ((android.support.design.widget.NavigationView) (findViewById(R.id.activity_main_drawer_navigation)));
    if ((navigationView.getHeaderView(0)) == null) {
        android.view.View headerView = getLayoutInflater().inflate(R.layout.navigation_header, navigationView, false);
        navigationView.addHeaderView(headerView);
    }
    if ((navigationView.getHeaderView(0)) != null) {
        android.view.View headerView = navigationView.getHeaderView(0);
        if (com.appcliente.wegest.WebViewAppConfig.NAVIGATION_DRAWER_HEADER_IMAGE) {
        }
    }
}