@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_drawable_home);
    mDrawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    nvDrawer = ((android.support.design.widget.NavigationView) (findViewById(R.id.nvView)));
    setupDrawerContent(nvDrawer);
    if (savedInstanceState == null) {
        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.flContent, new kiu.sei.informatica.br.uniba.it.kiu.fragment.ListPostFragment());
        ft.commit();
    }
}