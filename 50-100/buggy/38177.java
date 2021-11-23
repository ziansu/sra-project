public final java.util.Set<java.lang.Integer> generateRandom(final int max, final int count) {
    int temp = 0;
    for (int i = 0; i < count; i++) {
        temp = this.random.nextInt(max);
        if (!(this.list.contains(temp))) {
            this.list.add(temp);
        }else {
            i--;
        }
    }
    return this.list;
}