@java.lang.Override
protected void onRightClick(fr.moribus.imageonmap.guiproko.list.ImageMap data) {
    if (data instanceof fr.moribus.imageonmap.guiproko.list.SingleMap)
        return ;
    
    fr.moribus.imageonmap.guiproko.list.Gui.open(getPlayer(), new fr.moribus.imageonmap.guiproko.list.MapDetailGui(((fr.moribus.imageonmap.guiproko.list.PosterMap) (data))));
}