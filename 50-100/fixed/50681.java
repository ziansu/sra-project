protected void onResume() {
    int nextwordIndex = ((prevIndex) + 1) % (words.size());
    prevIndex = nextwordIndex;
    com.example.irtazasafi.mnemorizer.VocabularyWord nextWord = words.get(nextwordIndex);
    currwordID = nextWord.id;
    wordView.setText(nextWord.word);
    super.onResume();
}