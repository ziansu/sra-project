@java.lang.Override
protected void onResume() {
    super.onResume();
    switch (current.viewId) {
        case R.layout.main :
            gotoMain();
            break;
        case R.layout.consult :
            gotoConsult();
            break;
        case R.layout.readdesc :
            gotoReadDesc();
            break;
        case R.layout.settings :
            gotoSettings();
            break;
    }
    loadSettings();
}