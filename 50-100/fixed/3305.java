public static int getDistance(ca.rmen.nounours.data.Image image, java.lang.String featureId, int x, int y) {
    ca.rmen.nounours.data.ImageFeature featureImage = image.getImageFeature(featureId);
    if (featureImage == null) {
        java.lang.System.out.println(((("Feature " + featureId) + " is not in image ") + image));
        return java.lang.Integer.MAX_VALUE;
    }
    return ca.rmen.nounours.Util.getDistance(featureImage.getX(), featureImage.getY(), x, y);
}