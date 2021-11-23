private java.lang.String getSoundName(net.minecraft.server.v1_12_R1.SoundEffect sound) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.NoSuchFieldException, java.lang.SecurityException {
    java.lang.String soundName = "";
    net.minecraft.server.v1_12_R1.MinecraftKey minecraftKey = getMinecraftKey(sound);
    if (minecraftKey != null) {
        soundName = minecraftKey.a();
    }
    return soundName;
}