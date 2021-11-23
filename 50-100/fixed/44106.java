public static java.lang.String getAdId() {
    java.util.Random r = new java.util.Random();
    int Low = 1;
    int High = 100;
    int k = (r.nextInt((High - Low))) + Low;
    if (k < 10) {
        return "ben:payday";
    }
    if (k < 50) {
    }
    if (k < 80) {
        return "ben:payday";
    }
    return "ben:payday";
}