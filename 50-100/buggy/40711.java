@java.lang.Override
public java.lang.String toString() {
    java.lang.String currentGen = "";
    for (int x = -(shiftedRightwards); x < ((super.getWidth()) - (shiftedRightwards)); x++) {
        for (int y = -(shiftedDownwards); y < ((super.getHeight()) - (shiftedDownwards)); y++) {
            if (getCellState(x, y, BoardContainer.CURRENTGENERATION))
                currentGen += "1";
            else
                currentGen += "0";
            
        }
    }
    return currentGen;
}