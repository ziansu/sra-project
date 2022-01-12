public void buildMap() {
    for (int i = 1; i < (raw.size()); i += 2) {
        byte[] k = raw.get(i);
        byte[] v = raw.get((i + 1));
        keys.add(k);
        items.put(k, v);
    }
}