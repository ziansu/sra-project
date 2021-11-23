public static java.util.UUID getUUIDOf(java.lang.String name) {
    if (!(name.richardson.james.bukkit.banhammer.model.UUIDFetcher.CACHE.containsKey(name))) {
        name.richardson.james.bukkit.banhammer.model.UUIDFetcher fetcher = new name.richardson.james.bukkit.banhammer.model.UUIDFetcher(java.util.Arrays.asList(name));
        try {
            name.richardson.james.bukkit.banhammer.model.UUIDFetcher.CACHE.putAll(fetcher.call());
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    return name.richardson.james.bukkit.banhammer.model.UUIDFetcher.CACHE.get(name);
}