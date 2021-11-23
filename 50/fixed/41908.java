private void checkShowTutorial() {
    boolean tutorialDisplayedOnLastCheck = mDisplayTutorial;
    mDisplayTutorial = mData.isEmpty();
    mNumberOfTutorialViews = (mDisplayTutorial) ? 1 : 0;
    if (tutorialDisplayedOnLastCheck != (mDisplayTutorial))
        notifyDataSetChanged();
    
}