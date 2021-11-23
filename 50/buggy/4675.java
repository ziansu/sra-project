public com.anion155.tfc_advancedblueprint.Helpers.BlueprintHelper getBlueprintHelper() {
    if (hasFlag(com.anion155.tfc_advancedblueprint.GUI.GuiAdvBlueprintWidget.flag_layer_has_been_changed))
        WriteChanges();
    
    return bl_helper;
}