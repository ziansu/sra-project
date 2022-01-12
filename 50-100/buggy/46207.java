@java.lang.Override
public void onClick(android.view.View v) {
    com.example.acer.taxiapp.fragments.ConfigFragment configFragment = ((com.example.acer.taxiapp.fragments.ConfigFragment) (fManager.findFragmentByTag("TAG_CONFIG_FRAGMENT")));
    if ((configFragment == null) || (!(configFragment.isVisible()))) {
        android.app.FragmentTransaction fTransaction = fManager.beginTransaction();
        fTransaction.replace(R.id.fragment_content_container, new com.example.acer.taxiapp.fragments.ConfigFragment(), "TAG_CONFIG_FRAGMENT");
        fTransaction.addToBackStack("frag_conf");
        fTransaction.commit();
    }
}