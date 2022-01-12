private void showFragmentMap(java.util.ArrayList<java.lang.String[]> Lijst) {
    android.app.Fragment newFrag = new nmct.howest.be.desproject.ShowMapFragment();
    android.app.FragmentManager fMgr = getFragmentManager();
    android.app.FragmentTransaction fTr = fMgr.beginTransaction();
    fTr.replace(R.id.container, newFrag);
    fTr.addToBackStack("mainfrag");
    fTr.commit();
}