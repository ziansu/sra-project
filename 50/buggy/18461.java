private void changeFragment(android.support.v4.app.Fragment fragment) {
    getSupportFragmentManager().beginTransaction().addToBackStack(fragment.getTag()).replace(R.id.container, fragment).commit();
}