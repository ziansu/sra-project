private void changeFragment(android.support.v4.app.Fragment fragment) {
    getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
}