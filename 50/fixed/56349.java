public void onNewQuestionClick(android.view.MenuItem item) {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    com.cp1.translator.fragments.AskQuestionFragment askQuestionFragment = com.cp1.translator.fragments.AskQuestionFragment.newInstance();
    askQuestionFragment.show(fm, "AskQuestion");
}