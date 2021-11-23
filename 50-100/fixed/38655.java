public void rgbRegen(int[] rgb) {
    float[] rgba = new float[]{ 1 , 1 , 1 , 1 };
    RbTree<Integer, Area.Shape>.EntryIterator it = shapes.new EntryIterator(shapes.firstEntry());
    while (it.hasNext()) {
        AreaPixel.convexCombine(it.next().getValue().rgba, rgba, rgba);
    } 
    AreaPixel.colorSkipAlpha(rgba, newRgb);
}