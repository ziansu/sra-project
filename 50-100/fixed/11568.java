public void computeDemoRectangle(float viewWidth, float viewHeight) {
    if (((demoData) != null) && ((demoData.size()) == 0)) {
        float centerX = viewWidth / 2;
        float centerY = viewHeight / 2;
        float deltaX = viewWidth / ((float) (de.peterloos.beziersplines.utils.ControlPointsHolder.NumDemoEdges));
        float deltaY = viewHeight / ((float) (de.peterloos.beziersplines.utils.ControlPointsHolder.NumDemoEdges));
        demoData = de.peterloos.beziersplines.utils.ControlPointsHolder.getDemoRectangle(centerX, centerY, deltaX, deltaY);
    }
}