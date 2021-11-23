private int getNextId(int id) {
    while (idlist.contains(id)) {
        id++;
    } 
    return id;
}