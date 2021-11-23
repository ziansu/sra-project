public void add(int item) {
    for (int i = 1; i < (last); i++) {
        if (item > (getItems()[i])) {
            for (int z = i; z < (last); z++) {
                getItems()[z] = getItems()[(z - 1)];
            }
        }
    }
    (last)++;
}