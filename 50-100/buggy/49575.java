public boolean touchDown(int screenX, int screenY, int height, int width) {
    java.lang.System.out.println(screenX);
    if (screenX < (width / 4)) {
        moveLeft();
    }else
        if (screenX > ((3 * width) / 4)) {
            moveRight();
        }else
            if (screenY > (height / 2)) {
                moveDown();
            }else {
                moveUp();
            }
        
    
    return false;
}