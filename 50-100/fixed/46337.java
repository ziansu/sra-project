@java.lang.Override
protected void keyTyped(char par1, int par2) {
    nameTextField.textboxKeyTyped(par1, par2);
    getButtonByID(com.anion155.tfc_advancedblueprint.GUI.GuiAdvBlueprintViewer.done_bt_ind).enabled = (nameTextField.getText().trim().length()) > 0;
    if ((par2 == (org.lwjgl.input.Keyboard.KEY_ESCAPE)) || ((par2 == (org.lwjgl.input.Keyboard.KEY_E)) && (stack.stackTagCompound.hasKey(ItemAdvBlueprint.tag_item_name))))
        actionPerformed(getButtonByID(com.anion155.tfc_advancedblueprint.GUI.GuiAdvBlueprintViewer.cancel_bt_ind));
    
}