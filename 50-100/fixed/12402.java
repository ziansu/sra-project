private java.util.List<de.htw_berlin.HoboOthello.KI.Field> listPossibleSideFields() {
    java.util.List<de.htw_berlin.HoboOthello.KI.Field> listOfPossibleMoves = listPossibleMoves();
    java.util.List<de.htw_berlin.HoboOthello.KI.Field> listOfPossibleSideFields = null;
    int sideFieldIndex = 0;
    while (sideFieldIndex < ((listOfPossibleMoves.size()) - 1)) {
        de.htw_berlin.HoboOthello.KI.Field field = listOfPossibleMoves.get(sideFieldIndex);
        if (board.isSideField(field)) {
            listOfPossibleSideFields.add(field);
        }
        sideFieldIndex++;
    } 
    return listOfPossibleSideFields;
}