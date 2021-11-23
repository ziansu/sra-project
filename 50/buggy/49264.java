private java.awt.Color AVGPixelVal(java.awt.Color color, int superSamplingLvl) {
    return color.multipleByScalar((1 / superSamplingLvl));
}