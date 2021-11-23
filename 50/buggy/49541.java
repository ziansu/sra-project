@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    switch (position) {
        case 1 :
            return "Preview";
        case 2 :
            return "Reference";
        default :
            return "Convert";
    }
}