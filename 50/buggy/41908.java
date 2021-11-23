private void checkShowTutorial() {
    boolean tutorialDisplayedOnLastCheck = mDisplayTutorial;
    boolean isEmpty = mData.isEmpty();
    mDisplayTutorial = !isEmpty;
    mNumberOfTutorialViews = (isEmpty) ? 0 : 1;
    if (tutorialDisplayedOnLastCheck != (mDisplayTutorial))
        notifyDataSetChanged();
    
}