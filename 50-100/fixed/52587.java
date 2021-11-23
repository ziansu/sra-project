public net.minecraft.util.IIcon getIconAt(int side, int x, int y) {
    if (chanceCubes.config.CCubesSettings.hasHolidayTexture)
        return this.specialIcons[side].getSubIcon(x, y);
    else
        return this.subMap[side].getSubIcon(x, y);
    
}