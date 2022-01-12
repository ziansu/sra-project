equipment getEquipFromID(int id, int type) {
    for (int n = 0; n < (equipVector.size()); n++) {
        if (((equipVector.elementAt(n).getId()) == id) && ((equipVector.elementAt(n).getType()) == type)) {
            return equipVector.elementAt(n);
        }
    }
    return equipVector.elementAt(0);
}