@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    java.lang.String events = "Events";
    java.lang.String calc = "Calculator";
    java.lang.String results = "Results";
    switch (position) {
        case 0 :
            return events;
        case 1 :
            return calc;
        default :
            return null;
    }
}