public static java.lang.String getRandomString(java.util.List<java.lang.String> strings) {
    java.lang.String result = "";
    if ((strings.size()) > 0) {
        result = strings.get(com.jsl.babytrader.Utilities.CommonUtilities.getRandomInteger(0, strings.size()));
    }
    return result;
}