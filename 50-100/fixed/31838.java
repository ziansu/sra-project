private boolean checkForBulletClicks(me.ci.Branch b, java.awt.Point p) {
    if ((b.isVisible()) && (b.floatingLimb.isOverBullet(p, ((int) (scrollPosition))))) {
        b.setExpanded((!(b.isExpanded())));
        updateSearch(true);
        return true;
    }
    if (b.isExpanded())
        for (me.ci.Branch a : b.getChildren())
            if (checkForBulletClicks(a, p))
                return true;
            
        
    
    return false;
}