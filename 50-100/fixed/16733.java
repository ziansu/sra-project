private boolean outOfBounds(se.liu.ida.groupl2.tddd78.projekt.Collidable moving) {
    double mXPos = moving.getXPos();
    double mYPos = moving.getYPos();
    double mWidth = moving.getWidth();
    double mHeight = moving.getHeight();
    if ((mXPos < 0) || ((mXPos + mWidth) > (se.liu.ida.groupl2.tddd78.projekt.GameBoard.WIDTH))) {
        return true;
    }else
        if ((mYPos + mHeight) > (getYCoord(mXPos))) {
            return true;
        }else {
            return false;
        }
    
}