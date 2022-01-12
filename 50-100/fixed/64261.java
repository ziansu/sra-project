public void consume(java.util.Map<net.minecraft.item.Item, java.lang.Integer> map) {
    for (net.minecraft.item.Item i : map.keySet()) {
        map.put(i, ((map.getOrDefault(i, 0)) - (items.get(i))));
    }
}