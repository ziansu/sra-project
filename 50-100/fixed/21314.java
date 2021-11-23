public java.util.ArrayList<net.minecraft.item.ItemStack> getDisplay() {
    if ((display) == null) {
        display = new java.util.ArrayList<net.minecraft.item.ItemStack>();
        for (java.util.ArrayList<com.kawaiiwolf.kawaiicrops.lib.DropTable.DropTableItem> set : list)
            if (set != null)
                for (com.kawaiiwolf.kawaiicrops.lib.DropTable.DropTableItem item : set)
                    if ((item != null) && ((item.item) != null))
                        display.add(item.item.copy());
                    
                
            
        
    }
    return display;
}