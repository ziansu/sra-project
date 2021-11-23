int getIndexOfMin(java.util.ArrayList<instancefactory.service.Eintrag> list) {
    int index = 0;
    int minWert = 0;
    for (int k = 0; k < (list.size()); k++) {
        if ((list.get(k).value) < minWert) {
            minWert = list.get(k).value;
            index = k;
        }
    }
    return index;
}