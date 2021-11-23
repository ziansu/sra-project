public void mouseReleased(java.awt.event.MouseEvent e) {
    dragging = false;
    if ((e.getButton()) == (java.awt.event.MouseEvent.BUTTON1)) {
        java.lang.System.out.println("released");
        command = new controller.TravelCommand(currentPersModel, initPosX, initPosy, e.getX(), e.getY());
        cmdMan.storeAndExecute(command, currentPersModel.getID());
    }
}