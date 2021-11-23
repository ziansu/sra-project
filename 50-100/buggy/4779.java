public static java.lang.String getRandomString(java.lang.String... strings) {
    java.lang.String result = "";
    if ((strings.length) > 0) {
        result = strings[com.jsl.babytrader.Utilities.CommonUtilities.getRandomInteger(0, ((strings.length) - 1))];
    }
    return result;
}