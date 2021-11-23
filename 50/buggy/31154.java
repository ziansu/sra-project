public void swapItems(java.util.List<model.Word> wordList) {
    if (!(wordList.equals(null))) {
        this.mVocablist = wordList;
        notifyDataSetChanged();
    }
}