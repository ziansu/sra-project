private void hitMyself() {
    for (com.example.nia.groupproject_sojourner.FreeCell freeCell : fcs) {
        if ((freeCell != (getSnakeHead())) && (freeCell.getPointLoc().equals(getSnakeHead().getPointLoc())))
            destroyIt();
        
    }
}