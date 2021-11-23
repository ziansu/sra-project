@java.lang.Override
public void onNavigationDrawerItemSelected(int position) {
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.Fragment nextFragment;
    switch (position) {
        default :
        case 0 :
            nextFragment = new it.jaschke.alexandria.ListOfBooksFragment();
            break;
        case 1 :
            nextFragment = new it.jaschke.alexandria.AddBookFragment();
            break;
        case 2 :
            nextFragment = new it.jaschke.alexandria.AboutFragment();
            break;
    }
    fragmentManager.beginTransaction().replace(R.id.container, nextFragment).commit();
}