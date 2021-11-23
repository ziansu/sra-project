protected <E extends fr.scarex.sclib.item.AbstractSCItem> E addItem(E item) {
    itemMap.put(item.getClass(), item);
    return item;
}