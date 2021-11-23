private void move(double y) {
    if (((y % (Histogram.BAR_WIDTH)) == 0) && (moveValid((y - ((getHeight()) / 2))))) {
        setY((y - (getHeight())));
        setX((closeToOtherSlider() ? EXPANED_SLIDER_X : Histogram.SQUARE_START));
        moveLineAndText();
        model.driver.Grader.getCurve().adjust(grade, getScoreFromLocation());
    }
}