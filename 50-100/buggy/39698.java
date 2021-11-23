public static java.util.List<com.cliffcrosland.kirkpatrickseidel.Point2> findUndominatedMaxima(java.util.List<com.cliffcrosland.kirkpatrickseidel.Point2> points) {
    java.util.List<com.cliffcrosland.kirkpatrickseidel.Point2> copyOfPoints = new java.util.ArrayList<com.cliffcrosland.kirkpatrickseidel.Point2>(points);
    java.util.List<com.cliffcrosland.kirkpatrickseidel.Point2> maxima = new java.util.ArrayList<com.cliffcrosland.kirkpatrickseidel.Point2>();
    com.cliffcrosland.kirkpatrickseidel.KirkpatrickSeidelMaxima.recursiveFindUndominatedMaxima(copyOfPoints, maxima);
    return maxima;
}