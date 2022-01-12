public static boolean runMessage(java.lang.String key, net.minecraft.nbt.NBTTagCompound root) {
    chylex.hee.api.message.MessagePattern pattern = chylex.hee.api.message.MessageRegistry.registry.get(org.apache.commons.lang3.StringUtils.removeStart(key, "HEE:"));
    if (pattern == null) {
        chylex.hee.api.message.utils.MessageLogger.logError("Message key not found: $0", key);
        return false;
    }
    return pattern.tryRun(root);
}