private void print() {
    for (int i = 0; i < (capacity); i++) {
        ru.mail.polis.OpenHashTable<E>.Node curr = table.get(i);
        if (!(curr.deleted)) {
            java.lang.System.out.println(((("idx = " + i) + ", ") + curr));
        }
    }
    java.lang.System.out.println(("capacity: " + (capacity)));
    java.lang.System.out.println("-------------------------");
}