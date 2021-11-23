private void updateLifelinesPosition() {
    java.util.Iterator<uml.sequencediagram.Lifeline> it = lifelines.iterator();
    while (it.hasNext()) {
        ((uml.sequencediagram.Lifeline) (it.next())).setCurrentPosition(currentTimePosition);
    } 
    (currentTimePosition)++;
}