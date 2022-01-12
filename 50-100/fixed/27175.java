@java.lang.Override
protected void setup() {
    addSlotBox(new mcjty.container.SlotDefinition(mcjty.container.SlotType.SLOT_SPECIFICITEM, new net.minecraft.item.ItemStack(DimletSetup.knownDimlet)), mcjty.rftools.blocks.dimlets.DimensionEnscriberContainer.CONTAINER_INVENTORY, mcjty.rftools.blocks.dimlets.DimensionEnscriberContainer.SLOT_DIMLETS, 13, 7, 13, 18, 7, 18);
    addSlotBox(new mcjty.container.SlotDefinition(mcjty.container.SlotType.SLOT_OUTPUT), mcjty.rftools.blocks.dimlets.DimensionEnscriberContainer.CONTAINER_INVENTORY, mcjty.rftools.blocks.dimlets.DimensionEnscriberContainer.SLOT_TAB, 13, 142, 1, 18, 1, 18);
    layoutPlayerInventorySlots(85, 142);
}