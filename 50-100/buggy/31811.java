@java.lang.Override
public void remove() {
    it.remove();
    T toRemove = order.get(last);
    java.util.TreeSet<java.lang.Long> where = values.get(toRemove);
    where.remove(last);
    if ((where.size()) == 0) {
        values.remove(toRemove);
    }
}