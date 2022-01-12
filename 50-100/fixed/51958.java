@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    java.util.Locale l = java.util.Locale.getDefault();
    switch (position) {
        case 0 :
            return getString(R.string.title_section2);
        case 1 :
            return getString(R.string.title_section1);
        case 2 :
            return getString(R.string.title_section3);
    }
    return null;
}