public void renumbering() {
    amm.fem.RenumerationResult result = renumerate(points.size(), triangles);
    amm.fem.model.Point[] newPoints = new amm.fem.model.Point[result.pointsOrder.length];
    for (int i = 0; i < (newPoints.length); i++) {
        newPoints[i] = points.get(result.pointsOrder[i]);
    }
    points = new java.util.ArrayList(java.util.Arrays.asList(newPoints));
    triangles = result.triangles;
}