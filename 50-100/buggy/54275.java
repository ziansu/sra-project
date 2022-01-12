protected void loadNatives() {
    if (com.jme3.system.lwjgl.JmeSystem.isLowPermissions()) {
        return ;
    }
    if ("LWJGL".equals(settings.getAudioRenderer())) {
        com.jme3.system.lwjgl.NativeLibraryLoader.loadNativeLibrary("openal", true);
    }
    if (settings.useJoysticks()) {
    }
    if (com.jme3.system.lwjgl.NativeLibraryLoader.isUsingNativeBullet()) {
        com.jme3.system.lwjgl.NativeLibraryLoader.loadNativeLibrary("bulletjme", true);
    }
    com.jme3.system.lwjgl.NativeLibraryLoader.loadNativeLibrary("lwjgl", true);
}