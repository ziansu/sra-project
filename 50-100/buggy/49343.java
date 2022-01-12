public void setHeroSuit(net.minecraft.item.ItemArmor helmet, net.minecraft.item.ItemArmor chestplates, net.minecraft.item.ItemArmor legging, net.minecraft.item.ItemArmor boots) {
    if ((((helmet == null) || (chestplates == null)) || (legging == null)) || (boots == null))
        throw new java.lang.IllegalArgumentException("NULL!");
    
    heroSuit[0] = helmet;
    heroSuit[1] = chestplates;
    heroSuit[2] = legging;
    heroSuit[3] = boots;
}