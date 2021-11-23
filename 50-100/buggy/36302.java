public static <T, E> E getValueByKey(org.basex.web.servlet.impl.Map<T, E> map, T key) {
    for (org.basex.web.servlet.impl.Map.Entry<T, E> entry : map.entrySet()) {
        if (key.equals(entry.getKey())) {
            return entry.getValue();
        }
    }
    return null;
}