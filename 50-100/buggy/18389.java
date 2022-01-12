public static armyc2.c2sd.renderer.utilities.ImageInfo renderImage(java.lang.String symbolCode, android.util.SparseArray<java.lang.String> modifiers, android.util.SparseArray<java.lang.String> attributes) {
    if (!(gov.nasa.worldwindx.milstd2525.MilStd2525.initialized)) {
        throw new java.lang.IllegalStateException(gov.nasa.worldwind.util.Logger.logMessage(Logger.ERROR, "MilStd2525", "renderImage", "renderer has not been initialized."));
    }
    return gov.nasa.worldwindx.milstd2525.MilStd2525.renderer.RenderIcon(symbolCode, (modifiers == null ? gov.nasa.worldwindx.milstd2525.MilStd2525.defaultModifiers : modifiers), (attributes == null ? gov.nasa.worldwindx.milstd2525.MilStd2525.defaultAttributes : attributes));
}