@java.lang.Override
public void put(ecologylab.net.ParsedURL key, ecologylab.bigsemantics.metadata.builtins.Document document) {
    cache.put(new net.sf.ehcache.Element(key.toString(), document));
}