@java.lang.Override
public void remove() {
    T toRemove = order.get(last);
    it.remove();
    java.util.TreeSet<java.lang.Long> where = values.get(toRemove);
    where.remove(last);
    if ((where.size()) == 0) {
        values.remove(toRemove);
    }
}