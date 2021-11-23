public static <T, E> E getValueByKey(java.util.Map<T, E> map, T key) {
    for (java.util.Map.Entry<T, E> entry : map.entrySet()) {
        if (key.equals(entry.getKey())) {
            return entry.getValue();
        }
    }
    return null;
}