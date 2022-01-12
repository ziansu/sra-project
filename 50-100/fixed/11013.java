private void updateLifelinesPosition() {
    java.util.Iterator<uml.sequencediagram.Lifeline> it = lifelines.iterator();
    (currentTimePosition)++;
    while (it.hasNext()) {
        ((uml.sequencediagram.Lifeline) (it.next())).setCurrentPosition(currentTimePosition);
    } 
}