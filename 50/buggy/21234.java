public static void setMOD_ID(java.lang.String modId) {
    if ((com.foudroyantfactotum.tool.structure.StructureRegistry.MOD_ID) == null) {
        com.foudroyantfactotum.tool.structure.StructureRegistry.MOD_ID = modId;
        com.foudroyantfactotum.tool.structure.net.StructureNetwork.init();
    }
}