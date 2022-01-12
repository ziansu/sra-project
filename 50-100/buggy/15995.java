public void initializeGlobals() {
    android.support.design.widget.NavigationView navigationView = ((android.support.design.widget.NavigationView) (findViewById(R.id.nav_view)));
    navigationView.setNavigationItemSelectedListener(this);
    menu = navigationView.getMenu();
    progressBar = ((android.widget.ProgressBar) (findViewById(R.id.progressbar_wrap)));
    progressBar.getProgressDrawable().setColorFilter(Color.BLUE, android.graphics.PorterDuff.Mode.SRC_IN);
    webView = ((android.webkit.WebView) (this.findViewById(R.id.wrapView)));
    fab = ((android.support.design.widget.FloatingActionButton) (findViewById(R.id.fab)));
}