@java.lang.Override
public void showBreakTimeDlg(long cargoWorkId) {
    android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
    if (manager != null) {
        scs71.com.scscws.ui.main_menu.break_time_dlg.BreakTimeDlg dlg = scs71.com.scscws.ui.main_menu.break_time_dlg.BreakTimeDlg.newInstance(cargoWorkId, this);
        manager.beginTransaction().add(R.id.main_menu_root, dlg, scs71.com.scscws.ui.main_menu.break_time_dlg.BreakTimeDlg.class.getName()).commit();
    }
}