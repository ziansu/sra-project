public void touchDown(int screenX, int screenY, int width, int height) {
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
        
    
    return ;
}