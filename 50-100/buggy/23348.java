public void deletePolygon(int k) {
    if ((k != (-1)) && (k < (polygons.size()))) {
        java.lang.System.out.println(k);
        polygons.remove(k);
        polygonNames.remove(k);
        repaint();
    }
}