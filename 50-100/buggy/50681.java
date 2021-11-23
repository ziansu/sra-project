protected void onResume() {
    java.lang.System.out.println("********** onResume in singeWORDPAGE CALLED");
    java.lang.System.out.println(("*********** VALUE OF PREVIOUS INDEX IS " + (prevIndex)));
    int nextwordIndex = ((prevIndex) + 1) % (words.size());
    prevIndex = nextwordIndex;
    java.lang.System.out.println(("********** VALUE OF NEXT WORD INDEX IS  " + nextwordIndex));
    com.example.irtazasafi.mnemorizer.VocabularyWord nextWord = words.get(nextwordIndex);
    currwordID = nextWord.id;
    wordView.setText(nextWord.word);
    super.onResume();
}