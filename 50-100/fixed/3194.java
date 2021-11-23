@java.lang.Override
public boolean onLongClick(android.view.View p1) {
    running = false;
    pause = false;
    android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
    dk.vongriffen.mycountdown.TL_Add_DialogFragment t_add_d = new dk.vongriffen.mycountdown.TL_Add_DialogFragment();
    java.lang.String s = getResources().getString(R.string.t_add_dialog_title);
    t_add_d.setDialogTitle(s);
    t_add_d.show(manager, "T_Add");
    return true;
}