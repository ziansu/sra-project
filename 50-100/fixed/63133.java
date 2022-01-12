public void drawScreen(int par1, int par2, float partialTick, java.awt.Rectangle vp, java.awt.Rectangle parentBounds) {
    if (!(updateCamera(partialTick, vp.x, vp.y, vp.width, vp.height))) {
        return ;
    }
    applyCamera(partialTick);
    TravelController.instance.setSelectionEnabled(false);
    renderScene();
    TravelController.instance.setSelectionEnabled(true);
    renderSelection();
    renderOverlay(par1, par2);
}