public static void registerMCBindings() {
    com.google.common.collect.ImmutableBiMap.Builder<net.minecraft.client.settings.KeyBinding, moze_intel.projecte.utils.PEKeybind> builder = com.google.common.collect.ImmutableBiMap.builder();
    for (moze_intel.projecte.utils.PEKeybind k : moze_intel.projecte.utils.PEKeybind.values()) {
        net.minecraft.client.settings.KeyBinding mcK = new net.minecraft.client.settings.KeyBinding(k.keyName, k.defaultKeyCode, moze_intel.projecte.PECore.MODID);
        builder.put(mcK, k);
        cpw.mods.fml.client.registry.ClientRegistry.registerKeyBinding(mcK);
    }
    moze_intel.projecte.utils.ClientKeyHelper.mcToPe = builder.build();
    moze_intel.projecte.utils.ClientKeyHelper.peToMc = moze_intel.projecte.utils.ClientKeyHelper.mcToPe.inverse();
}