public net.minecraft.util.IIcon getIconAt(int side, int x, int y) {
    if (chanceCubes.config.CCubesSettings.hasHolidayTexture) {
        if ((side == 0) || (side == 1))
            return this.specialIcons[0].getSubIcon(x, y);
        else
            return this.specialIcons[1].getSubIcon(x, y);
        
    }else
        return this.subMap[side].getSubIcon(x, y);
    
}