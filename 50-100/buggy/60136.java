private int getIndexOfShoe(int id, double size) {
    for (int i = 0; i < (shoes.size()); ++i) {
        if (((shoes.get(i).getID()) == id) && ((shoes.get(i).getSize()) == size)) {
            return i;
        }
    }
    return -1;
}