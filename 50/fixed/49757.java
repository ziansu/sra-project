@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    if (((titles) != null) && ((titles.length) > position)) {
        return titles[position];
    }
    return "";
}