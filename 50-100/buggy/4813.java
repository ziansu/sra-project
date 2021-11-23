public static void addAurora(final org.blockartistry.mod.DynSurround.data.AuroraData data) {
    if (!(org.blockartistry.mod.DynSurround.ModOptions.getAuroraEnable()))
        return ;
    
    if (((org.blockartistry.mod.DynSurround.client.AuroraEffectHandler.auroraDimension) != (data.dimensionId)) || ((org.blockartistry.mod.DynSurround.client.EnvironStateHandler.EnvironState.getDimensionId()) != (data.dimensionId))) {
        org.blockartistry.mod.DynSurround.client.AuroraEffectHandler.auroras.clear();
        org.blockartistry.mod.DynSurround.client.AuroraEffectHandler.currentAurora = null;
        org.blockartistry.mod.DynSurround.client.AuroraEffectHandler.auroraDimension = data.dimensionId;
    }
    org.blockartistry.mod.DynSurround.client.AuroraEffectHandler.auroras.add(data);
}