@java.lang.Override
public void onNavigationDrawerItemSelected(int position) {
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.Fragment nextFragment;
    switch (position) {
        default :
        case 0 :
            nextFragment = new it.jaschke.alexandria.ListOfBooks();
            break;
        case 1 :
            nextFragment = new it.jaschke.alexandria.AddBook(this);
            break;
        case 2 :
            nextFragment = new it.jaschke.alexandria.About();
            break;
    }
    fragmentManager.beginTransaction().replace(R.id.container, nextFragment).addToBackStack(((java.lang.String) (title))).commit();
}