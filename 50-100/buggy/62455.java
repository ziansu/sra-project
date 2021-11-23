private void changeHeight(double height) {
    container.setPrefHeight(height);
    titleRectangle.setHeight(java.lang.Math.min(TOP_MAX_HEIGHT, (height * (TOP_HEIGHT_RATIO))));
    attributesRectangle.setHeight(((height - (titleRectangle.getHeight())) / 2));
    operationsRectangle.setHeight(((height - (titleRectangle.getHeight())) / 2));
}