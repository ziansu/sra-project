public edu.cosc4950.phatlab.sNode findTrigger(edu.cosc4950.phatlab.sNode startNode, int track, long beat, int step) {
    track = clamp(track, 0, 11);
    long globalStep = (beat * (spb)) + step;
    if ((triggerList[track]) == null)
        return null;
    
    if (startNode == null)
        return triggerList[track].find(globalStep);
    else
        return startNode.find(globalStep);
    
}