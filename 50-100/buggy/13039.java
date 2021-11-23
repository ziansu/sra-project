@java.lang.Override
public <T> T query(java.lang.Class<T> clazz) {
    java.lang.Object inst = org.wikiup.core.util.Interfaces.unwrap(clazz, wrapped);
    if (inst == null) {
        if (byClasses.containsKey(clazz))
            return org.wikiup.core.util.Interfaces.cast(clazz, byClasses.get(clazz));
        
        inst = translator.translate(wrapped);
        byClasses.put(clazz, inst);
    }
    return org.wikiup.core.util.Interfaces.cast(clazz, inst);
}