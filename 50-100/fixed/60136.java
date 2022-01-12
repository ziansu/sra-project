private int getIndexOfShoe(int id, double size) {
    if ((shoes.size()) == 0)
        return -1;
    
    for (int i = 0; i < (shoes.size()); ++i) {
        if (((shoes.get(i).getID()) == id) && ((shoes.get(i).getSize()) == size)) {
            return 1;
        }
    }
    return -1;
}