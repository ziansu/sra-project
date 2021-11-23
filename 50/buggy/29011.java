public java.lang.String getFormattedDays() {
    java.lang.String result = days;
    result = result.replace("u", "");
    result = result.replace("a", "");
    return result;
}