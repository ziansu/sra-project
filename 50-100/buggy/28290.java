public void addPrefixMatch(final java.lang.String prefix, final io.undertow.servlet.handlers.ServletChain match, final boolean requireWelcomeFileMatch) {
    io.undertow.util.SubstringMap.SubstringMatch<io.undertow.servlet.handlers.ServletPathMatchesData.PathMatch> mt = prefixMatches.getExact(prefix);
    io.undertow.servlet.handlers.ServletPathMatchesData.PathMatch m;
    if (mt == null) {
        prefixMatches.put(prefix, (m = new io.undertow.servlet.handlers.ServletPathMatchesData.PathMatch(match)));
    }else {
        m = mt.getValue();
    }
    m.defaultHandler = match;
    m.requireWelcomeFileMatch = requireWelcomeFileMatch;
}