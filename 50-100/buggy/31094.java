public void addExtensionMatch(final java.lang.String prefix, final java.lang.String extension, final io.undertow.servlet.handlers.ServletChain match) {
    io.undertow.util.SubstringMap.SubstringMatch<io.undertow.servlet.handlers.ServletPathMatchesData.PathMatch> mt = prefixMatches.getExact(prefix);
    io.undertow.servlet.handlers.ServletPathMatchesData.PathMatch m;
    if (mt == null) {
        prefixMatches.put(prefix, (m = new io.undertow.servlet.handlers.ServletPathMatchesData.PathMatch(null)));
    }else {
        m = mt.getValue();
    }
    m.extensionMatches.put(extension, match);
}