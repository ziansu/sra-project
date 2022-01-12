public void deleteById(java.lang.String id) {
    for (int i = 0; i < (this.position); i++) {
        if ((items[i].getId()) == id) {
            items[i] = null;
            break;
        }
    }
}