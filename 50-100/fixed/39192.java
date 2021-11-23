@java.lang.Override
protected void onResume() {
    super.onResume();
    loadSettings();
    switch (current.viewId) {
        case R.layout.consult :
            gotoConsult();
            break;
        case R.layout.readdesc :
            gotoReadDesc();
            break;
        case R.layout.settings :
            gotoSettings();
            break;
        default :
            gotoMain();
    }
}