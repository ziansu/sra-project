@java.lang.Override
public void onBackPressed() {
    if (currentFragment.isBackTop()) {
        finish();
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }else {
        currentFragment.goUp();
    }
}