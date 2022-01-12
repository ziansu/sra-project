private void deleteSelectedItems() {
    java.util.List<java.lang.Integer> pairIdsToRemove = new java.util.ArrayList<>();
    for (int i = 0; i < (mIsSelected.size()); i++) {
        if (mIsSelected.get(i)) {
            mCursor.moveToPosition(i);
            pairIdsToRemove.add(mCursor.getInt(mCursor.getColumnIndex(WordsContract.Pairs.WORD_PAIR_ID)));
        }
    }
    com.github.bwindsor.pairlearnapp.WordsDataSource.removePairs(this, pairIdsToRemove);
    refreshCursor();
}