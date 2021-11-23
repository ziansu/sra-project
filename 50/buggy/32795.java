public static boolean removeRemoteUpdate(mods.ocminecart.common.entityextend.RemoteCartExtender ext) {
    if (!(mods.ocminecart.common.entityextend.RemoteExtenderRegister.updater.contains(ext)))
        return false;
    
    mods.ocminecart.common.entityextend.RemoteExtenderRegister.removeExistingRemote(ext.getAddress());
    mods.ocminecart.common.entityextend.RemoteExtenderRegister.updater.remove(ext);
    return true;
}