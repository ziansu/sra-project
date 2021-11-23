public boolean lessThan(T element, long block) {
    return lessThan(serialize(element), block);
}