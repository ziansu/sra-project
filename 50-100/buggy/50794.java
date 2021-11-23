public boolean isTime(java.lang.String str) {
    java.lang.String tf24 = "([012]?[0-9]|1[0-9]|2[0-3]):[0-5][0-9]";
    java.lang.String tf12first = "(1[012]|[1-9]|0[1-9]):[0-5][0-9](?i)(am|pm)";
    java.lang.String tf12second = "(1[012]|[1-9])(?i)(am|pm)";
    return ((java.util.regex.Pattern.matches(tf24, str)) | (java.util.regex.Pattern.matches(tf12first, str))) | (java.util.regex.Pattern.matches(tf12second, str));
}