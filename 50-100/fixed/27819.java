public void addInformation(net.minecraft.item.ItemStack stack, net.minecraft.entity.player.EntityPlayer player, java.util.List list, boolean displayInfo) {
    if (displayInfo)
        if (((stack != null) && ((darkknight.jewelrycraft.util.JewelryNBT.item(stack)) != null)) && ((darkknight.jewelrycraft.util.JewelryNBT.item(stack).getItem()) instanceof net.minecraft.item.ItemFood))
            list.add(((net.minecraft.util.EnumChatFormatting.DARK_PURPLE) + "It's made of solid gold! How are you suppose to eat this?"));
        else
            list.add(((net.minecraft.util.EnumChatFormatting.DARK_PURPLE) + "Shiny, but useless :("));
        
    
}