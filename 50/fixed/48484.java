protected boolean onUndo(android.view.View view) {
    if (!(placedTiles.isEmpty())) {
        com.google.engedu.wordstack.LetterTile tile = placedTiles.pop();
        tile.moveToViewGroup(stackedLayout);
        return true;
    }else {
        return false;
    }
}