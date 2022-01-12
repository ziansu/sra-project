public void resize() {
    java.lang.Object[] temp = new java.lang.Object[(storage.length) * 2];
    java.lang.System.arraycopy(storage, head, temp, 0, ((storage.length) - (head)));
    java.lang.System.arraycopy(storage, 0, temp, ((storage.length) - (head)), tail);
    head = (temp.length) - 1;
    tail = storage.length;
}