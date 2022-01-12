public void warpHorizontally(nl.tudelft.scrumbledore.LevelElement element) {
    double offset = (element.width()) / 2;
    if ((element.posX()) < (-offset)) {
        element.getPosition().setX(((Constants.LEVELX) + offset));
    }else
        if ((element.posX()) > ((Constants.LEVELX) + offset)) {
            element.getPosition().setX((-offset));
        }
    
}