private com.braunster.tutorialview.object.TutorialBuilder getBasicBuilderForTest(android.view.View v) {
    com.braunster.tutorialview.object.TutorialBuilder tBuilder = new com.braunster.tutorialview.object.TutorialBuilder();
    tBuilder.setTitle("The Title").setViewToSurround(v).setInfoText("This is the explanation about the view.").setBackgroundColor(randomColor()).setTutorialTextColor(Color.WHITE).setTutorialTextSize(30).setAnimationDuration(500);
    return tBuilder;
}