public boolean isKindOfLink(java.util.List<java.lang.String> list, java.lang.String proposition) {
    if (list.contains(proposition)) {
        return true;
    }else {
        for (java.lang.String premise : list) {
            if ((premise.contains("*")) && (java.util.regex.Pattern.compile(premise.replace("*", "[a-zA-Z0-9_]*")).matcher(proposition).matches())) {
                return true;
            }
        }
    }
    return false;
}