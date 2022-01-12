private boolean outOfBounds(se.liu.ida.groupl2.tddd78.projekt.Collidable moving) {
    double mXPos = moving.getXPos();
    double mYPos = moving.getYPos();
    double mWidth = moving.getWidth();
    double mHeight = moving.getHeight();
    double minimalYPOS = getYCoord(mXPos);
    if (((mXPos < 0) || ((mXPos + mWidth) > (se.liu.ida.groupl2.tddd78.projekt.GameBoard.WIDTH))) || ((mYPos + mHeight) > minimalYPOS)) {
        return true;
    }else {
        return false;
    }
}