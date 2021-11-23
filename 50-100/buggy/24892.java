public void saveToSP(android.content.SharedPreferences sp) {
    java.util.Set<java.lang.String> favoritePorts = new java.util.HashSet<>();
    for (com.avaa.balitidewidget.data.Entry<java.lang.String, com.avaa.balitidewidget.data.Port> portEntry : entrySet()) {
        if (portEntry.getValue().favorite)
            favoritePorts.add(portEntry.getKey());
        
    }
    sp.edit().putStringSet(com.avaa.balitidewidget.data.Ports.SPKEY_FAVORITE_PORTS, favoritePorts).apply();
}