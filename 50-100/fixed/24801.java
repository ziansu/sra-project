public Location remove() {
    Location oldval = sheep.get(1);
    if ((size) > 1) {
        sheep.set(1, sheep.remove(((size)--)));
        doAPushUpButStayDownSoItsNotReallyAPushup(1);
    }else {
        sheep.remove(((size)--));
    }
    return oldval;
}