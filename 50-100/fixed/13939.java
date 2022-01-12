public int GetYHeight(int posX, int startY, int posZ) {
    int y = startY;
    while ((y > 48) && (!(((this.worldObj.getBlock(posX, y, posZ)) == (net.minecraft.init.Blocks.air)) && ((this.worldObj.getBlock(posX, (y - 1), posZ)) != (net.minecraft.init.Blocks.air))))) {
        y--;
    } 
    return y;
}