@java.lang.Override
public void setup() {
    g = new xbhs.battleship.game.Game(10, 10, this);
    list = new java.util.ArrayList<xbhs.battleship.gui.GUIElement>();
    size(initWidth, initHeight);
    background(0);
    for (int i = 0; i < (list.size()); i++)
        list.get(i).init();
    
}