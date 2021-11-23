@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
public com.thecodewarrior.guides.views.View getView(int width, int height) {
    if ((this.guide) == "") {
        return null;
    }else
        if ((this.guide) == null) {
            return new com.thecodewarrior.guides.views.ViewNull(width, height, this.gui);
        }else {
            return null;
        }
    
}