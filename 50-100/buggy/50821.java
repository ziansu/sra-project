public void click(projectone.game.Room room, projectone.Engine.GameJFrame frame, java.awt.Point cursorTile, java.awt.event.MouseEvent e) {
    if (selected) {
        stoneAction(cursorTile, room, frame);
        if (!(activeUnit.canAttack))
            frame.action = new projectone.Engine.fAction.ChooseAction();
        
        if ((attackMap[cursorTile.x][cursorTile.y]) < 1)
            projectone.Engine.fAction.StoneAction.macOn(cursorTile, room, frame, e);
        else
            frame.action = new projectone.Engine.fAction.ChooseAction();
        
    }
}