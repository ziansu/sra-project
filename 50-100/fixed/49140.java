public static void addElement(xbhs.battleship.gui.GUIElement e) {
    if ((xbhs.battleship.gui.GUIElementListHandler.list.size()) == 0) {
        xbhs.battleship.gui.GUIElementListHandler.list.add(e);
        return ;
    }
    for (int i = 0; i < (xbhs.battleship.gui.GUIElementListHandler.list.size()); i++)
        if ((e.getRenderPriority()) < (xbhs.battleship.gui.GUIElementListHandler.list.get(i).getRenderPriority())) {
            xbhs.battleship.gui.GUIElementListHandler.list.add(i, e);
            return ;
        }
    
}