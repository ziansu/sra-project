public void startFragment(java.lang.String _query) {
    com.iderson.currencyguide.fragments.GuideFragment fragment;
    fragment = new com.iderson.currencyguide.fragments.GuideFragment();
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString(DATA, _query);
    fragment.setArguments(bundle);
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    fragmentManager.beginTransaction().replace(R.id.container, fragment).commit();
}