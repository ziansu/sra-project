private void processVision(core.events.Vision vision) {
    if (debug)
        java.lang.System.out.println("A vision event occured");
    
    if (((beliefMap) != null) && ((beliefMap) instanceof core.BeliefMap)) {
        ((core.BeliefMap) (beliefMap)).processVision(vision);
        beliefMapGUi.updateGui();
    }else
        java.lang.System.err.println("The beliefmap is null or its not an instance of the beliefmap");
    
    lastSeen = vision;
}