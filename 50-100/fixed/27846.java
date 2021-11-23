private void processVision(core.events.Vision vision) {
    if (debug)
        java.lang.System.out.println("A vision event occured");
    
    if (((beliefMap) != null) && ((beliefMap) instanceof core.BeliefMap)) {
        ((core.BeliefMap) (beliefMap)).processVision(vision);
        beliefMapGUi.updateGui();
    }
    lastSeen = vision;
}