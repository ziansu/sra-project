public boolean clearTrigger(int track, long globalStep) {
    track = clamp(track, 0, 11);
    if ((triggerList[track]) == null)
        return false;
    
    edu.cosc4950.phatlab.sNode node = triggerList[track].find(globalStep);
    if (node != null)
        node.clear();
    
    return node == null ? false : true;
}