public void keyUp(int keycode) {
    if (((isLeftKey) && (keycode == (leftKey))) || ((isRightKey) && (keycode == (rightKey)))) {
        isRunning = false;
    }else
        if ((isInteractKey) && (keycode == (interactKey))) {
            notifyInteractObjects(collidingBodies, false);
        }
    
}