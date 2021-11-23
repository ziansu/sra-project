private void initMain() {
    getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new com.zrecovery.ui.fragment.MainFragment()).commit();
    mainFragment = ((com.zrecovery.ui.fragment.MainFragment) (getSupportFragmentManager().findFragmentByTag("MainFragment")));
}