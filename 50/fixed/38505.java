public static void removePopup() {
    if (com.osreboot.ridhvl.menu.HvlMenu.popups.isEmpty())
        return ;
    
    com.osreboot.ridhvl.menu.HvlMenu.popups.pop();
    com.osreboot.ridhvl.menu.HvlMenu.blocks.pop();
}