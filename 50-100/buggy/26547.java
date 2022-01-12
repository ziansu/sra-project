private boolean isHigherPriority(jp.gr.java_conf.shioyang.polyhedraltodolist.PolyTodoItem previous, jp.gr.java_conf.shioyang.polyhedraltodolist.PolyTodoItem item) throws jp.gr.java_conf.shioyang.polyhedraltodolist.TaskMismatchPositionsException {
    boolean isHigher = false;
    if ((previous != null) && (item != null)) {
        int previousPosition = previous.getGlobalPosition();
        int itemPosition = item.getGlobalPosition();
        if ((!(verifyPosition(previousPosition, previous))) || (!(verifyPosition(itemPosition, item)))) {
            throw new jp.gr.java_conf.shioyang.polyhedraltodolist.TaskMismatchPositionsException("Position mismatch.");
        }
        if (previousPosition > itemPosition)
            return true;
        
    }
    return false;
}