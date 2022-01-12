public void checkSinking() {
    for (int i = 0; i < (ships.size()); i++) {
        if ((ships.get(0).isSunk()) == true)
            ships.remove(i);
        
    }
}