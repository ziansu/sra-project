public void setHeroSuit(net.minecraft.item.ItemArmor helmet, net.minecraft.item.ItemArmor chestplates, net.minecraft.item.ItemArmor legging, net.minecraft.item.ItemArmor boots) {
    if ((((helmet == null) || (chestplates == null)) || (legging == null)) || (boots == null))
        throw new java.lang.IllegalArgumentException("NULL!");
    
    heroSuit[3] = helmet;
    heroSuit[2] = chestplates;
    heroSuit[1] = legging;
    heroSuit[0] = boots;
}