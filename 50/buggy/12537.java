@java.lang.Override
public net.minecraft.util.IChatComponent toChatMessage() {
    net.minecraft.util.IChatComponent description = myessentials.localization.api.LocalManager.get(flagType.getDescriptionKey());
    return myessentials.localization.api.LocalManager.get("mytown.format.flag", flagType.name.toLowerCase(), value.toString(), description);
}