public static int addAssetPath(android.content.res.AssetManager assets, java.lang.String path) {
    if ((net.wequick.small.util.ReflectAccelerator.sAddAssetPath) == null) {
        net.wequick.small.util.ReflectAccelerator.sAddAssetPath = net.wequick.small.util.ReflectAccelerator.getMethod(android.content.res.AssetManager.class, "addAssetPath", new java.lang.Class[]{ java.lang.String.class });
    }
    if ((net.wequick.small.util.ReflectAccelerator.sAddAssetPath) == null)
        return 0;
    
    java.lang.Integer ret = net.wequick.small.util.ReflectAccelerator.invoke(net.wequick.small.util.ReflectAccelerator.sAddAssetPath, assets, path);
    if (ret == null)
        return 0;
    
    return ret;
}