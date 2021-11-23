private static double calculateNormalizationScale(final org.interactiverobotics.cv.face.dataset.FaceData faceData) {
    final org.interactiverobotics.geom.Point2D pointA = faceData.getPoint(org.interactiverobotics.cv.face.model.FaceShapeModelUtils.POINT_A_INDEX);
    final org.interactiverobotics.geom.Point2D pointB = faceData.getPoint(org.interactiverobotics.cv.face.model.FaceShapeModelUtils.POINT_B_INDEX);
    return 1.0 / (pointA.calculateDistanceTo(pointB));
}