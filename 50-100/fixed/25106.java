public static void clean() {
    com.mcjty.rftools.items.dimlets.KnownDimletConfiguration.lastId = 0;
    com.mcjty.rftools.items.dimlets.KnownDimletConfiguration.idToDimlet.clear();
    com.mcjty.rftools.items.dimlets.KnownDimletConfiguration.dimletToID.clear();
    com.mcjty.rftools.items.dimlets.KnownDimletConfiguration.idToDisplayName.clear();
    com.mcjty.rftools.items.dimlets.KnownDimletConfiguration.craftableDimlets.clear();
    com.mcjty.rftools.items.dimlets.KnownDimletConfiguration.dimletBlackList.clear();
    com.mcjty.rftools.items.dimlets.KnownDimletConfiguration.dimletRandomNotAllowed.clear();
    com.mcjty.rftools.items.dimlets.DimletMapping.clean();
    com.mcjty.rftools.items.dimlets.DimletRandomizer.clean();
}