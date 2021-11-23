public static <E> java.lang.reflect.Method getMethod(java.lang.Class<? super E> clazz, java.lang.String method, java.lang.Class<?>... methodTypes) {
    try {
        return net.minecraftforge.fml.relauncher.ReflectionHelper.findMethod(clazz, method, null, methodTypes);
    } catch (net.minecraftforge.fml.relauncher.ReflectionHelper e) {
        e.printStackTrace();
        return null;
    }
}