@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB)
protected void setFragment(android.app.Fragment fragment) {
    android.app.FragmentManager fm = getFragmentManager();
    android.app.FragmentTransaction transaction = fm.beginTransaction();
    transaction.replace(R.id.id_content, fragment);
    transaction.commit();
}