public java.util.ArrayList<net.minecraft.item.ItemStack> getDisplay() {
    if ((display) == null) {
        display = new java.util.ArrayList<net.minecraft.item.ItemStack>();
        for (java.util.ArrayList<com.kawaiiwolf.kawaiicrops.lib.DropTable.DropTableItem> set : list)
            for (com.kawaiiwolf.kawaiicrops.lib.DropTable.DropTableItem item : set)
                display.add(item.item.copy());
            
        
    }
    return display;
}