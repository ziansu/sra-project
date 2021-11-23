public void keyReleased(java.awt.event.KeyEvent e) {
    if (!(hypercard.context.GlobalContext.getContext().noMessages()))
        sendMessage("keyUp");
    
}