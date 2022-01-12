private void displayFragment(android.support.v4.app.Fragment fragment, java.lang.String title) {
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.page_body, fragment);
    fragmentTransaction.addToBackStack(title);
    fragmentTransaction.commit();
}