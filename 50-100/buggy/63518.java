public boolean connected(int a, int b) {
    if ((!(map.containsKey(a))) || (!(map.containsKey(b)))) {
        return false;
    }
    return map.get(a).equals(map.get(b));
}