public void createTimeline(int yearBeginn, int beginnQuarter, int yearEnd, int endQuarter) {
    quarterButtons.clear();
    javafx.scene.layout.AnchorPane time = buildTimeline(yearBeginn, beginnQuarter, yearEnd, endQuarter);
    this.setMinHeight(110.0);
    this.setMaxHeight(time.maxHeight(0.0));
    stkTimeline.getChildren().add(time);
}