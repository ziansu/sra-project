public void click(projectone.game.Room room, projectone.Engine.GameJFrame frame, java.awt.Point cursorTile, java.awt.event.MouseEvent e) {
    if (selected) {
        stoneAction(cursorTile, room, frame);
        if (!(activeUnit.canAttack))
            projectone.Engine.fAction.StoneAction.macOn(cursorTile, room, frame, e);
        
        if ((attackMap[cursorTile.x][cursorTile.y]) < 1)
            projectone.Engine.fAction.StoneAction.macOn(cursorTile, room, frame, e);
        else
            projectone.Engine.fAction.StoneAction.macOn(cursorTile, room, frame, e);
        
    }
}