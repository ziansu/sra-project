@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    switch (position) {
        case 0 :
            return "My App List";
        case 1 :
            return "All Apps";
        case 2 :
            return "Running Apps";
    }
    return null;
}