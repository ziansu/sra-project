private void addRegexOrPrefixedRegex(java.lang.String regexString) {
    if (hasPrefix(regexString)) {
        allTokens.add(new sub.fwb.parse.tokens.RegexPrefixed(regexString, solrFieldEnding));
    }else {
        allTokens.add(new sub.fwb.parse.tokens.Regex(regexString, solrFieldEnding));
    }
}