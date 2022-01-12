public graphicsHandler.GraphicObject.GraphicBuilder shadingElement(java.lang.String shadingColor, float offset) {
    if (((graphicsHandler.GraphicObject.verifyColor(shadingColor)) && (offset >= 0)) && (offset <= 1)) {
        shadingColors.add(shadingColor);
        offsets.add(offset);
    }
    return this;
}