public void removeItem(long eid) {
    for (int i = 0; i < (data.size()); i++) {
        if ((data.get(i).eid) == eid) {
            data.remove(i);
            i--;
        }
    }
}