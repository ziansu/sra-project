public void checkSinking() {
    for (int i = 0; i < (ships.size(0)); i++) {
        if ((ships.get(0).isSunk()) == true)
            ships.remove(i);
        
    }
}