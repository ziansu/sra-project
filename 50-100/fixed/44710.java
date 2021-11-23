public void randomise(android.view.View view) {
    mBingoAdapter = new org.askdn.bingo.BingoAdapter(this, populate());
    mGridView.setAdapter(mBingoAdapter);
    leftoutGrids = new java.util.HashMap<>();
    for (int i = 0; i < 25; i++) {
        leftoutGrids.put(i, i);
    }
}