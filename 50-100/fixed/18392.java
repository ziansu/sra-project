public void downsize(int n) {
    ExtendedList newList = new ExtendedList();
    for (int i = 0; i < (this.size()); i++) {
        if ((i % n) != 0) {
            newList.add(this.get(i));
        }
    }
    this.clear();
    this.addAll(newList);
}