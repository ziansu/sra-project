public void onClick(android.view.View v) {
    com.mortaramultimedia.wordwolf.shared.messages.TileData td = ((com.mortaramultimedia.wordwolf.shared.messages.TileData) (v.getTag()));
    c = com.mortaramultimedia.wordwolfappandroid.data.Model.getGameBoard().getLetterAtPos(td.getRow(), td.getCol());
    android.util.Log.d(com.mortaramultimedia.wordwolfappandroid.fragments.BoardFragment.TAG, ((("onLetterButtonClick: " + (td.toString())) + ": ") + (c)));
    com.mortaramultimedia.wordwolfappandroid.GameManager.processTileSelection(td);
    updateActivity();
}