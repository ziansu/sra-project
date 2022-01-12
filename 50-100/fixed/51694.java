private int getReviewId(java.lang.String repos, java.lang.String txn) throws org.hooks.SvnException {
    java.lang.String log = getLog(repos, txn);
    java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("^review:([0-9]+)").matcher(log);
    while (matcher.find()) {
        return java.lang.Integer.parseInt(matcher.group().substring(7));
    } 
    return -1;
}