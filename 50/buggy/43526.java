private double getLowestPossibleScore() {
    if ((model.driver.Grader.getCurve().getGradeBelow(grade)) != null) {
        return (model.driver.Grader.getCurve().getGradeBelow(grade).value()) + 1;
    }
    return 0;
}