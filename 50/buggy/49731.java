private void updateToolbarTitle(android.support.v4.app.Fragment fragment) {
    java.lang.String fragmentClassName = fragment.getClass().getName();
    if (fragmentClassName.equals(com.example.a1.projecttest.fragments.VospitannikFragment.class.getName())) {
        setTitle(getString(R.string.status_child));
    }
}