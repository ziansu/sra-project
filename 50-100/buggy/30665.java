private java.lang.Object asAuthority(java.util.Map<?, ?> map) {
    if ((map.size()) == 1) {
        return map.values().iterator().next();
    }
    for (java.lang.String key : org.springframework.boot.autoconfigure.security.oauth2.resource.FixedAuthoritiesExtractor.AUTHORITY_KEYS) {
        if (map.containsKey(key)) {
            return map.get(map);
        }
    }
    return map;
}