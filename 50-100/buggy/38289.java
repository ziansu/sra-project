public static java.util.regex.Matcher match(java.lang.String pattern, net.named_data.jndn.Name name) {
    java.lang.String nameUri = name.toUri();
    pattern = net.named_data.jndn.util.NdnRegexMatcher.sanitizeSets(pattern);
    pattern = pattern.replace("<>", "(?:<.+?>)");
    pattern = pattern.replace(">", "");
    pattern = pattern.replace("<(?!!)", "/");
    java.util.regex.Matcher match = java.util.regex.Pattern.compile(pattern).matcher(nameUri);
    if (match.find())
        return match;
    else
        return null;
    
}