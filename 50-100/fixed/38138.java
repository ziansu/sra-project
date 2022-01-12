@java.lang.Override
public boolean test(java.lang.StringBuilder s) {
    java.util.regex.Matcher matcher = postalCodePattern.matcher(s.toString());
    if (matcher.find()) {
        this.value = matcher.group().toUpperCase();
        s.delete(matcher.start(), matcher.end());
        s = new java.lang.StringBuilder(s.toString().trim());
        return true;
    }
    return false;
}