@java.lang.Override
public void nextTutorial(com.braunster.tutorialview.object.Tutorial tutorial) {
    setTutorial(tutorial, true);
    dispatchNextTutorialShown();
}