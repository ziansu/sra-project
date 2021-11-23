private boolean check(E itemForCheck) {
    LinkedSet<E>.Item<E> item = main;
    for (int i = 0; i < (size); i++) {
        if (item.equals(itemForCheck)) {
            return false;
        }
        item = item.next;
    }
    return true;
}