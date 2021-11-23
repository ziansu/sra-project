public static java.lang.String getExchange() {
    java.util.Random r = new java.util.Random();
    int Low = 1;
    int High = 100;
    int k = (r.nextInt((High - Low))) + Low;
    if (k < 10) {
        return "rubicon";
    }
    if (k < 20) {
        return "smaato";
    }
    if (k < 50) {
        return "nexage";
    }
    if (k < 75) {
        return "fyber";
    }
    return "privatex";
}