@java.lang.Override
public void render(org.newdawn.slick.GameContainer gameContainer, org.newdawn.slick.Graphics g) throws org.newdawn.slick.SlickException {
    se.gabmartdev.dungeonexplorer.DungeonGame.redbeard.getCurrentRoom().draw();
    se.gabmartdev.dungeonexplorer.DungeonGame.redbeard.draw();
    if (se.gabmartdev.dungeonexplorer.UserInterfaceManager.hasMessage()) {
        se.gabmartdev.dungeonexplorer.UserInterfaceManager.drawMessage(g);
    }
    if (se.gabmartdev.dungeonexplorer.UserInterfaceManager.isInInventory()) {
        se.gabmartdev.dungeonexplorer.UserInterfaceManager.drawInventory(g);
    }
}