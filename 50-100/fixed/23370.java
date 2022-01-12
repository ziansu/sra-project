@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    java.lang.String tabLabel = null;
    switch (position) {
        case 0 :
            tabLabel = getString(R.string.title_myBook);
            break;
        case 1 :
            tabLabel = getString(R.string.title_allBook);
            break;
        default :
            tabLabel = getString(R.string.title_myBook);
            break;
    }
    return tabLabel;
}