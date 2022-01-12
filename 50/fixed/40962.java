public net.minecraft.util.IIcon getIcon(int side, int meta) {
    if (side == 1) {
        return top;
    }else
        if (side == meta) {
            return front;
        }else {
            return this.blockIcon;
        }
    
}