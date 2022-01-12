public void destroyTool(int slot) {
    if ((slot == (-1)) || ((slots[slot]) == null))
        return ;
    
    if ((com.vanhal.progressiveautomation.ref.ToolHelper.tinkersType(slots[slot].getItem())) > 0) {
        addToInventory(slots[slot]);
    }else {
        if (!(com.vanhal.progressiveautomation.PAConfig.destroyTools)) {
            addToInventory(slots[slot]);
        }
    }
    slots[slot] = null;
}