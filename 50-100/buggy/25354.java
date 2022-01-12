private void setCameraPosition() {
    if ((com.gamefactoryx.cheers.tool.Orientation.getOrientation()) == (com.gamefactoryx.cheers.tool.Orientation.Landscape))
        camera.position.set((((com.gamefactoryx.cheers.tool.Resolution.getGameWorldWidthLandscape()) / 2) - 1), ((com.gamefactoryx.cheers.tool.Resolution.getGameWorldHeightLandscape()) / 2), 0);
    else
        camera.position.set(((com.gamefactoryx.cheers.tool.Resolution.getGameWorldWidthPortrait()) / 2), ((com.gamefactoryx.cheers.tool.Resolution.getGameWorldHeightPortrait()) / 2), 0);
    
    camera.update();
}