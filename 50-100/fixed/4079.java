private boolean checkIdAvailable(int id) {
    boolean found = false;
    for (int i = 0; i < (rooms.size()); i++) {
        if (id == (rooms.get(i).getId()))
            found = true;
        
    }
    return found;
}