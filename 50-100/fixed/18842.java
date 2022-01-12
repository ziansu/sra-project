public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((inventory.size()) == 0) {
        java.lang.System.out.println("Inventory Empty!");
        java.lang.System.out.println("");
    }else {
        java.lang.System.out.println("Inventory:");
        for (int loop = 0; loop < (inventory.size()); loop++) {
            java.lang.System.out.println(inventory.get(loop));
        }
        java.lang.System.out.println("");
    }
}