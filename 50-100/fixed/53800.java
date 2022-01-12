private static java.lang.Class<?> getMinecraftClass(java.lang.String name, java.lang.String... aliases) {
    java.lang.Class<?> clazz = net.dmulloy2.chat.ReflectionProvider.getMinecraftClass(name);
    if (clazz == null) {
        for (java.lang.String alias : aliases) {
            clazz = net.dmulloy2.chat.ReflectionProvider.getMinecraftClass(alias);
            if (clazz != null)
                return clazz;
            
        }
    }
    return clazz;
}