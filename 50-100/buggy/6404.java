@java.lang.Override
protected java.util.Map.Entry<java.lang.String, java.lang.Integer> calculateBestEntry() {
    java.lang.String context = matcher.context(matcher.getAbbreviation().getTokenWithContext());
    if (!(at.medunigraz.imi.abbres.TextUtils.isAbbreviation(context))) {
        return new java.util.AbstractMap.SimpleEntry<>("", 0);
    }
    return super.getBestEntry();
}