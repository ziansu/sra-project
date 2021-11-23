private static double divideAndConquer(java.util.ArrayList<ru.hh.school.zhdanov.Point> pointsList) {
    java.util.List<ru.hh.school.zhdanov.Point> pointsSortedByX = new java.util.ArrayList<ru.hh.school.zhdanov.Point>(pointsList);
    ru.hh.school.zhdanov.Problem1.sortByX(pointsSortedByX);
    java.util.List<ru.hh.school.zhdanov.Point> pointsSortedByY = new java.util.ArrayList<ru.hh.school.zhdanov.Point>(pointsList);
    ru.hh.school.zhdanov.Problem1.sortByY(pointsSortedByY);
    return ru.hh.school.zhdanov.Problem1.divideAndConquer(pointsSortedByX, pointsSortedByY);
}