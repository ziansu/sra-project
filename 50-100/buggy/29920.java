private boolean checkForCheckboxClicks(me.ci.Branch b, java.awt.Point p) {
    if ((b.isVisible()) && (b.floatingLimb.isOverCheckbox(p, ((int) (scrollPosition))))) {
        b.setDone((!(b.isDone())));
        return true;
    }
    for (me.ci.Branch a : b.getChildren())
        checkForCheckboxClicks(a, p);
    
    return false;
}