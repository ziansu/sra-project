@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    if ((keyCode == (android.view.KeyEvent.KEYCODE_BACK)) && ((event.getAction()) == (android.view.KeyEvent.ACTION_DOWN))) {
        if (mDrawerLayout.isDrawerOpen(Gravity.RIGHT)) {
            mDrawerLayout.closeDrawer(Gravity.RIGHT);
        }else {
            com.ogg.crm.utils.ActivitiyInfoManager.finishActivity("com.ogg.crm.ui.activity.CustomerListActivity");
            overridePendingTransition(R.anim.push_right_in, R.anim.push_down_out);
        }
        return true;
    }
    return super.onKeyDown(keyCode, event);
}