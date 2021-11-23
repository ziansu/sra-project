public boolean remove(java.lang.Object o) {
    int index = get_Index(o);
    if (index >= 0) {
        for (int j = index; j < ((size) - 1); j++) {
            set[j] = set[(j + 1)];
        }
        set[((size) - 1)] = null;
        (size)--;
        return true;
    }else {
        return false;
    }
}