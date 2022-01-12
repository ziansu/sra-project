public static <E> java.lang.reflect.Method getMethod(java.lang.Class<? super E> clazz, java.lang.String method, java.lang.Class<?>... methodTypes) {
    try {
        return net.minecraftforge.fml.relauncher.ReflectionHelper.findMethod(clazz, null, new java.lang.String[]{ method }, methodTypes);
    } catch (net.minecraftforge.fml.relauncher.ReflectionHelper e) {
        e.printStackTrace();
        return null;
    }
}