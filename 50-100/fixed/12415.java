public static pedca.context.Context createAndSaveBottleneckContext(java.lang.String path, float sizeX, float sizeY, float bottleneckWidth, float bottleneckHeight, float bottleneckPosY) {
    pedca.context.Context context = scenarios.ContextGenerator.getBottleneckContext(sizeX, sizeY, bottleneckWidth, bottleneckHeight, bottleneckPosY);
    try {
        context.saveConfiguration(path);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return context;
}