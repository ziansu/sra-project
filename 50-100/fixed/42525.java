public <T extends net.minecraft.item.Item & appeng.core.staticfire.item.StaticFireItemBase> void Reg(appeng.api.bootstrap.DefinitionFactory registry, T item) {
    appeng.core.core.bootstrap.ItemDefinitionBuilder a = registry.definitionBuilder(new net.minecraft.util.ResourceLocation(appeng.core.AppEng.MODID, item.getRegistryNameSF()), ih(item));
    a.defaultModel();
    a.build();
}