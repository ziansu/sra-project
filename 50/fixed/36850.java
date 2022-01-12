private int getNextId(int id) {
    id++;
    while (idlist.contains(id)) {
        id++;
    } 
    return id;
}