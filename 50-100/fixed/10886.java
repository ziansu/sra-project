public void onClick(android.view.View v) {
    com.cards.flash.testez.BaseFunction.hideKeyboard(getContext(), v);
    if (com.cards.flash.testez.EditCardFragment.hasTakenQuiz) {
        com.cards.flash.testez.EditCardFragment.hasTakenQuiz = false;
        updateScores();
    }
    android.content.Intent intent = new android.content.Intent(getContext(), com.cards.flash.testez.ScoreBoard.class);
    intent.putExtra("cat", MainActivity.cateList.get(com.cards.flash.testez.NavigationDrawerFragment.getCurrentSelectedPos()).getObjectId());
    startActivity(intent);
}