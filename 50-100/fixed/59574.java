public int selectedLandmark(final double[] ptarray, final boolean isMoving) {
    int selectedPointIndex = -1;
    if ((isMoving && ((landmarkModel.getTransform()) != null)) && (!(isMovingDisplayTransformed()))) {
        landmarkModel.getTransform().apply(ptarray, ptBack);
        selectedPointIndex = selectedLandmarkHelper(ptBack, isMoving);
    }else {
        selectedPointIndex = selectedLandmarkHelper(ptarray, isMoving);
    }
    return selectedPointIndex;
}