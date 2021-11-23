@java.lang.Override
public void onClick(it.neokree.materialnavigationdrawer.elements.MaterialSection section) {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    org.numixproject.hermes.HomeFragment fragment = ((org.numixproject.hermes.HomeFragment) (fm.findFragmentByTag("serverFragment")));
    fragment.openServerPane();
}