public int getMapWidth() {
    int width = currentMap.getProperties().get("width", java.lang.Integer.class);
    return width;
}