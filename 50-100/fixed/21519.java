public boolean isSideField(de.htw_berlin.HoboOthello.Core.Field field) {
    if (((field.getX()) == 0) || ((field.getX()) == ((boardSize) - 1))) {
        return true;
    }
    if (((field.getY()) == 0) || ((field.getY()) == ((boardSize) - 1))) {
        return true;
    }else {
        return false;
    }
}