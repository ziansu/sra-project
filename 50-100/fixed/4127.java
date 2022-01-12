private int check(E itemForCheck) {
    LinkedSet<E>.Item<E> item = main;
    for (int i = 0; i <= (size); i++) {
        if (itemForCheck.equals(item.value)) {
            return i;
        }
        item = item.next;
    }
    return -1;
}