public void nextTutorial(final android.view.View btn) {
    final java.lang.String[] tutorialMessages = getResources().getStringArray(R.array.tutorialMessages);
    if ((currentTutorialIndex) == (tutorialMessages.length)) {
        finishTutorial();
    }else {
        tutorialText.setText(tutorialMessages[((currentTutorialIndex)++)]);
        if ((currentTutorialIndex) == (tutorialMessages.length)) {
            nextButton.setText(getText(R.string.finish));
        }
    }
}