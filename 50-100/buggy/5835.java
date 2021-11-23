public static java.util.List<com.onpositive.text.analisys.Euristic> match(java.lang.Class<? extends com.onpositive.text.analysis.AbstractParser> clazz) {
    if (com.onpositive.text.analisys.Euristic.registered.containsKey(clazz))
        com.onpositive.text.analisys.Euristic.registered.put(clazz, new java.util.ArrayList<com.onpositive.text.analisys.Euristic>());
    
    return com.onpositive.text.analisys.Euristic.registered.get(clazz);
}