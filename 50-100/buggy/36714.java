private static void divideAndConquer(java.util.ArrayList<ru.hh.school.zhdanov.Point> pointsList) {
    java.util.List<ru.hh.school.zhdanov.Point> pointsSortedByX = new java.util.ArrayList<ru.hh.school.zhdanov.Point>(pointsList);
    ru.hh.school.zhdanov.Problem1.sortByX(pointsSortedByX);
    java.util.List<ru.hh.school.zhdanov.Point> pointsSortedByY = new java.util.ArrayList<ru.hh.school.zhdanov.Point>(pointsList);
    ru.hh.school.zhdanov.Problem1.sortByY(pointsSortedByY);
    java.lang.System.out.println(ru.hh.school.zhdanov.Problem1.divideAndConquer(pointsSortedByX, pointsSortedByY));
}