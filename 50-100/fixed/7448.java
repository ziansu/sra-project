public void onCredentialsValidated() {
    com.gabdeg.generalissimo.InputFragment firstFragment = new com.gabdeg.generalissimo.InputFragment();
    firstFragment.setArguments(getIntent().getExtras());
    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, firstFragment).commit();
    getSupportActionBar().setTitle("Home");
}