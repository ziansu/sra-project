@java.lang.Override
public void onBackPressed() {
    if ((_currFrag.isVisible()) && (!((_currFrag) instanceof com.algorythmsteam.algorythms.AlgoryhmsMainFragment))) {
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        com.algorythmsteam.algorythms.AlgoryhmsMainFragment amf = new com.algorythmsteam.algorythms.AlgoryhmsMainFragment();
        _currFrag = amf;
        fragmentTransaction.setCustomAnimations(R.anim.enter_reverse, R.anim.exit_reverse);
        fragmentTransaction.replace(R.id.main_activity_fragment_container, amf, AlgoryhmsMainFragment.TAG);
        fragmentTransaction.commit();
        return ;
    }
    super.onBackPressed();
}