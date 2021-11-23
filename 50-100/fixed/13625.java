private int pieceInGoodPosition(nl.tue.s2id90.draughts.DraughtsState state) {
    int result = 0;
    int[] pieces = state.getPieces();
    for (int i = 0; i < (pieces.length); i++) {
        if ("middle".equals(getPosition(i))) {
            if (((pieces[i]) == 1) || ((pieces[i]) == 3)) {
                result++;
            }else {
                result--;
            }
        }
    }
    return result;
}