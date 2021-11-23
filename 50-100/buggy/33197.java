private void replace() {
    int x = 0;
    int y = 0;
    for (fr.iutvalence.info.dut.m2107.inventory.InventorySlot slot : inventorySlot) {
        slot.getBackground().setPosition(((startX) + ((width) * x)), ((startY) - (((height) * 1.75F) * y)));
        java.lang.System.out.println(y);
        x++;
        if (x == (inventoryWidth)) {
            x = 0;
            y++;
        }
    }
}