public void deletePolygon(int k) {
    if ((k != (-1)) && (k < (polygons.size()))) {
        polygons.remove(k);
        polygonNames.remove(k);
        repaint();
    }
}