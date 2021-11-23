private java.util.Set<com.lucid.rc.AddressConfig> getDatacenterIPsFor(java.util.Map<java.lang.String, java.lang.String> writeMap) {
    java.util.Set<com.lucid.rc.AddressConfig> ips = new java.util.HashSet<>();
    for (java.lang.String key : writeMap.keySet()) {
        for (com.lucid.rc.AddressConfig config : datacenterIPs) {
            if (serverContainsKey(config, key)) {
                ips.add(config);
            }
        }
    }
    return ips;
}