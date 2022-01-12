private long[] getPattern(java.lang.String string) {
    switch (sharedPreferences.getString(string, "vibrate_short")) {
        case "vibrate_short" :
            return new long[]{ 0 , 200 };
        case "vibrate_long" :
            return new long[]{ 0 , 400 };
        case "vibrate_double" :
            return new long[]{ 0 , 200 , 200 , 200 };
        case "vibrate_double_long" :
            return new long[]{ 0 , 400 , 300 , 400 };
        default :
            return new long[0];
    }
}