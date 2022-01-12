@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.fragment_action_menu, menu);
    android.view.SubMenu available_devics = menu.addSubMenu("更換連結裝置");
    for (int id = 0; id < (edu.nthu.nmsl.itri_app.settings.Devices.getInstance().getDeviceNumber()); id++) {
        available_devics.add(edu.nthu.nmsl.itri_app.FragmentActivity.menu_device_group_id, id, Menu.NONE, edu.nthu.nmsl.itri_app.settings.Devices.getInstance().getDeviceName(id));
    }
    return true;
}