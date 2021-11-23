public com.visenze.visearch.Box scale(float ratio) {
    return new com.visenze.visearch.Box(((int) ((x1) * ratio)), ((int) ((x2) * ratio)), ((int) ((y1) * ratio)), ((int) ((y2) * ratio)));
}