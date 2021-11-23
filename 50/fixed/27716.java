@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return com.podraza.android.gaogao.gaogao.MainActivity.PlaceholderFragment.newInstance((position + 1), getPageTitle(position));
}