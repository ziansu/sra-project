@java.lang.Override
protected void onResume() {
    be.marche.ac.apptravaux.lib.TravauxUtils.refreshFragment(be.marche.ac.apptravaux.MainActivity.FRAGMENT_ACCOUNT, fragmentManager);
    super.onResume();
}