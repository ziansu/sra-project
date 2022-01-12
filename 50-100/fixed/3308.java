public java.lang.Object getGuiElement() {
    if (!(this.isConnected())) {
        java.lang.System.out.println("getGuiElement - null (no connection)");
        return null;
    }
    int metadata = this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord);
    if (erogenousbeef.bigreactors.common.block.BlockReactorPart.isController(metadata)) {
        return new erogenousbeef.bigreactors.client.gui.GuiReactorStatus(new erogenousbeef.bigreactors.gui.container.ContainerReactorController(this), this);
    }
    return null;
}