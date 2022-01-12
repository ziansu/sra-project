@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public com.creativemd.creativecore.gui.GuiControl getGuiControl(java.lang.String id) {
    java.util.ArrayList<com.creativemd.creativecore.gui.GuiControl> controls = getGuiControls();
    if (controls == null)
        return null;
    
    for (int i = 0; i < (controls.size()); i++) {
        if (controls.get(i).is(id))
            return controls.get(i);
        
    }
    return null;
}