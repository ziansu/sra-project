public void deleteById(java.lang.String id) {
    for (int i = 0; i < (this.position); i++) {
        if (((items[i]) != null) && (items[i].getId().equals(id))) {
            items[i] = null;
            break;
        }
    }
}