@java.lang.Override
public boolean onCreateOptionsMenu(in.celest.xash3d.dedicated.Menu menu) {
    menu.add(Menu.NONE, 1, Menu.NONE, R.string.b_master);
    menu.add(Menu.NONE, 2, Menu.NONE, R.string.b_refresh_cache);
    menu.add(Menu.NONE, 3, Menu.NONE, R.string.b_about);
    menu.add(Menu.NONE, 4, Menu.NONE, R.string.b_scut);
    menu.add(Menu.NONE, 5, Menu.NONE, R.string.b_settings);
    return super.onCreateOptionsMenu(menu);
}