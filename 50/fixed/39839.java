public static void serverTick() {
    for (int i = 0; i < (mods.ocminecart.common.entityextend.RemoteExtenderRegister.updater.size()); i += 1) {
        mods.ocminecart.common.entityextend.RemoteExtenderRegister.updater.get(i).update();
    }
}