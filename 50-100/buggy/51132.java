public int getRealPosition(int position) {
    int hElements = getHiddenCountUpTo(position);
    int diff = 0;
    for (int i = 0; i < hElements; i++) {
        diff++;
        if (hidden.contains(currentComments.get((position + diff)).getName())) {
            i--;
        }
    }
    return position + diff;
}