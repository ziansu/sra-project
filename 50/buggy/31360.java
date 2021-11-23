private void execute(org.decaywood.entity.KeyEvent event) throws java.lang.InterruptedException {
    if ((sequencer) == null) {
        java.lang.System.out.println("sequencer == null");
    }else
        sequencer.processKeyEvent(event, this::sendEvent);
    
}