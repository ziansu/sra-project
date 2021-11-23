public void delete(java.lang.String uuid) {
    int index = getIndex(uuid);
    if (index < 0) {
        java.lang.System.out.println((("Resume " + uuid) + " not exist"));
    }else {
        delHelper(index);
        storage[((size) - 1)] = null;
        (size)--;
    }
}