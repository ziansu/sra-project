private int pieceInGoodPosition(nl.tue.s2id90.draughts.DraughtsState state) {
    int result = 0;
    int[] pieces = state.getPieces();
    for (int i = 0; i < (pieces.length); i++) {
        if ((getPosition(i)) == "middle") {
            if (((pieces[i]) == 1) || ((pieces[i]) == 3)) {
                result += 20;
            }else {
                result -= 20;
            }
        }
    }
    return result;
}