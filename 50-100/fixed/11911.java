public void mouseReleased(java.awt.event.MouseEvent e) {
    if ((e.getButton()) == (java.awt.event.MouseEvent.BUTTON1)) {
        dragging = false;
        java.lang.System.out.println("released");
        command = new controller.TravelCommand(currentPersModel, initPosX, initPosy, e.getX(), e.getY());
        cmdMan.storeAndExecute(command, currentPersModel.getID());
    }
}