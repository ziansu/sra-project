public boolean findItem(java.lang.String item) {
    boolean q = false;
    java.lang.String name = item;
    for (int num = 0; num < 101; num++) {
        if (items[num][0].toLowerCase().equals(name.toLowerCase())) {
            q = true;
        }
    }
    return q;
}