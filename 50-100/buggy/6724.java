@java.lang.Override
protected void onResume() {
    super.onResume();
    if (DEBUG)
        android.util.Log.d(org.pyneo.tabulae.TAG, "Tabulae.onResume");
    
    android.app.FragmentManager fragmentManager = getFragmentManager();
    android.app.FragmentTransaction tx = fragmentManager.beginTransaction();
    for (org.pyneo.tabulae.Base b : fragments) {
        tx.add(R.id.tabulae, b, b.getClass().getSimpleName());
    }
    tx.commit();
}