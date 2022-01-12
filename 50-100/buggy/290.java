public void nextTutorial(final android.view.View btn) {
    final java.lang.String[] tutorialMessages = getResources().getStringArray(R.array.tutorialMessages);
    if ((currentTutorialIndex) == ((tutorialMessages.length) - 1)) {
        finishTutorial();
    }else {
        tutorialText.setText(tutorialMessages[((currentTutorialIndex)++)]);
        if ((currentTutorialIndex) == ((tutorialMessages.length) - 1)) {
            nextButton.setText(getText(R.string.finish));
        }
    }
}