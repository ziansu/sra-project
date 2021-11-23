public void indexJumpDown() {
    if (((currentItemIndex) + (com.harvest.hud_elements.HUDVars.INVENTORY_ROW_SIZE)) > ((list.size()) - 1)) {
        currentItemIndex = (currentItemIndex) % (com.harvest.hud_elements.HUDVars.INVENTORY_ROW_SIZE);
    }else {
        currentItemIndex = (currentItemIndex) + (com.harvest.hud_elements.HUDVars.INVENTORY_ROW_SIZE);
    }
}