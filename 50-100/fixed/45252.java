public void warpHorizontally(nl.tudelft.scrumbledore.LevelElement element) {
    double offset = 0;
    if ((element.posX()) <= (-offset)) {
        element.getPosition().setX(((Constants.LEVELX) - 1));
    }else
        if ((element.posX()) >= ((Constants.LEVELX) + offset)) {
            element.getPosition().setX(1);
        }
    
}