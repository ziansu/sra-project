public void renderTransparency(net.minecraft.util.IIcon icon, codechicken.lib.render.CCModel cc, codechicken.lib.colour.Colour color) {
    if (color != null) {
        cc.render(new codechicken.lib.render.uv.IconTransformation(icon), new codechicken.lib.render.ColourMultiplier(color.rgba()));
    }else {
        cc.render(new codechicken.lib.render.uv.IconTransformation(icon));
    }
}