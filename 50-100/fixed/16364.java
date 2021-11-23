public void putAll(java.util.Map<? extends K, ? extends C> map) {
    for (java.util.Map.Entry<? extends K, ? extends C> entry : map.entrySet()) {
        addAll(entry.getKey(), entry.getValue());
    }
}