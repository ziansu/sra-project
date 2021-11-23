public void findPossibleMoves(int x, int y) {
    availMoves = new java.util.ArrayList<>();
    if (((counter) % 2) == (PLAYER_TWO)) {
        searchP2();
        android.util.Log.d("TAG", ((availMoves.size()) + ""));
    }else {
        searchP1();
    }
    gameBoardView.setAvailMoves(availMoves);
    gameBoardView.setSelectedPiece(selectedPiece);
}