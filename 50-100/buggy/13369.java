equipment getEquipFromID(int id) {
    equipment i = null;
    for (int n = 0; n < (equipVector.size()); n++) {
        int test = equipVector.elementAt(n).getId();
        if (test == id) {
            i = equipVector.elementAt(n);
        }
    }
    return i;
}