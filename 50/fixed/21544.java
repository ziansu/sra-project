public void replaceFragmentWithSelected(android.support.v4.app.Fragment fragment) {
    android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
    fragmentTransaction.replace(R.id.frame_content, fragment);
    fragmentTransaction.commit();
}