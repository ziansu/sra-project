@java.lang.Override
public byte[] transform(java.lang.String name, java.lang.String name2, byte[] bytes) {
    if (bytes == null)
        return null;
    
    try {
        if (name.equals("net.minecraft.server.MinecraftServer")) {
            return patchServerTickrate(bytes);
        }
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
    return bytes;
}