public java.util.regex.Pattern getDispatchRegex() {
    java.lang.String masterRegex = null;
    for (opendap.hai.HttpResponder p : responders) {
        if (masterRegex != null)
            masterRegex += "|";
        else
            masterRegex = "";
        
        masterRegex += p.getRequestMatchRegexString();
    }
    return java.util.regex.Pattern.compile(masterRegex);
}