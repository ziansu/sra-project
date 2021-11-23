@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return com.rmc.thienle.jedi2.MainActivity.PlaceholderFragment.newInstance((position + 1), switchId);
}