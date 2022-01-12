public boolean setPos(int col, int row) {
    colPos = col;
    rowPos = row;
    if ((image) != null) {
        int lengthPos = col * (unit);
        int heightPos = row * (unit);
        image.setBounds(heightPos, lengthPos, (heightPos + (unit)), (lengthPos + (unit)));
        return true;
    }else {
        return false;
    }
}