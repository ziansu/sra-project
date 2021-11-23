private java.lang.String getChanged() {
    java.lang.String str;
    if ((blocksChanged) > 0) {
        mmdanggg2.cste.util.CSTELogger.logDebug(((blocksChanged) + " blocks were changed."));
        str = net.minecraft.client.resources.I18n.format("commands.cste.fill.success", blocksChanged);
    }else {
        mmdanggg2.cste.util.CSTELogger.logDebug("No blocks changed");
        str = net.minecraft.client.resources.I18n.format("commands.cste.fill.nochange");
    }
    clearAll();
    return str;
}