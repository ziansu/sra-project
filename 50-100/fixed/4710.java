public static int getThemeDrawable(android.app.Activity activity) {
    switch (com.supersnek.accounting.Utils.Utils.getThemNumber(activity)) {
        case 0 :
            return R.drawable.header_green_bluejpg;
        case 1 :
            return R.drawable.header_blue_red;
        case 2 :
            return R.drawable.header_orange_teal;
        case 3 :
            return R.drawable.header_purple_lime;
        case 4 :
            return R.drawable.header_red_green;
        case 5 :
            return R.drawable.header_red_purple;
        case 6 :
            return R.drawable.header_green_bluejpg;
        case 7 :
            return R.drawable.header_blue_red;
        case 8 :
            return R.drawable.header_orange_teal;
        case 9 :
            return R.drawable.header_purple_lime;
        case 10 :
            return R.drawable.header_red_green;
        case 11 :
            return R.drawable.header_red_purple;
        default :
            return R.drawable.header_blue_red;
    }
}