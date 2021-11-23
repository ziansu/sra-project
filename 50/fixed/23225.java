@java.lang.Override
public boolean replace(ecologylab.net.ParsedURL key, ecologylab.bigsemantics.metadata.builtins.Document oldDocument, ecologylab.bigsemantics.metadata.builtins.Document newDocument) {
    java.lang.String k = key.toString();
    return cache.replace(new net.sf.ehcache.Element(k, oldDocument), new net.sf.ehcache.Element(k, newDocument));
}