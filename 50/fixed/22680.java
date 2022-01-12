@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    switch (position) {
        case 0 :
            return "Home";
        case 1 :
            return "News";
        case 2 :
            return "Event";
    }
    return null;
}