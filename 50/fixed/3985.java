@java.lang.Override
public boolean containsKey(ecologylab.net.ParsedURL key) {
    return cache.isKeyInCache(key.toString());
}