public void mouseReleased(java.awt.event.MouseEvent arg0) {
    loader.connection.moveUnit(loader.game.getSelectedUnits(), true, true, true);
    java.lang.System.out.println("NOW! ATTACK THE BASE!");
}