@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    arudra.mycompany.com.assignment4.Search.fragmentNumber = position;
    return arudra.mycompany.com.assignment4.Search.PlaceholderFragment.newInstance((position + 1));
}