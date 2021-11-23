@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    switch (position) {
        case 0 :
            return "My App List";
        case 2 :
            return "All Apps";
        case 1 :
            return "Running Apps";
    }
    return null;
}