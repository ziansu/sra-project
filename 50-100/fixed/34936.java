public void updateRender(int section) {
    if ((section >= 0) && (section < (renderStatus.length)))
        renderStatus[section] = ethanjones.cubes.graphics.world.AreaRenderStatus.UNKNOWN;
    
    if (((areaRenderer) != null) && ((areaRenderer[section]) != null))
        areaRenderer[section].refresh = true;
    
}