@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    switch (position) {
        case 0 :
            return "Ingredients";
        case 1 :
            return "Steps";
        default :
            return null;
    }
}