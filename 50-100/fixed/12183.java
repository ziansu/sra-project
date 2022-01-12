private static boolean isKeyPressed(net.minecraft.client.settings.KeyBinding instance) {
    try {
        java.lang.reflect.Field field = net.minecraft.client.settings.KeyBinding.class.getDeclaredField("pressTime");
        field.setAccessible(true);
        java.lang.Object obj = field.get(instance);
        int c = ((java.lang.Integer) (obj));
        if (c > 0) {
            return true;
        }
    } catch (java.lang.Exception e) {
    }
    return false;
}