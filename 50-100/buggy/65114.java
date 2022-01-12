private java.util.List<de.htw_berlin.HoboOthello.KI.Field> listPossibleFieldsNotTooCloseToBorder() {
    java.util.List<de.htw_berlin.HoboOthello.KI.Field> listOfPossibleMoves = listPossibleMoves();
    java.util.List<de.htw_berlin.HoboOthello.KI.Field> listOfFieldsNotCloseToBorder = null;
    int count = 0;
    while (count < (listOfPossibleMoves.size())) {
        de.htw_berlin.HoboOthello.KI.Field field = listOfPossibleMoves.get(count);
        if (board.isNotSideMinusOneField(field)) {
            listOfFieldsNotCloseToBorder.add(field);
        }else {
            count++;
        }
    } 
    return listOfFieldsNotCloseToBorder;
}