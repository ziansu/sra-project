public void add(int item) {
    for (int i = 0; i < (last); i++) {
        if (item > (getItems()[i])) {
            for (int z = i; z < (last); z++) {
                getItems()[(z + 1)] = getItems()[z];
            }
            (last)++;
        }
    }
}