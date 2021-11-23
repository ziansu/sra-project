public railo.runtime.type.Collection.Key[] keys(int access) {
    java.util.Set<railo.runtime.type.Collection.Key> set = keySet(access);
    return set.toArray(new railo.runtime.type.Collection.Key[set.size()]);
}