public void moveAndFill(int direction) {
    direction = direction % 12;
    switch (direction) {
        case 3 :
            moveRight();
            break;
        case 6 :
            moveDown();
            break;
        case 9 :
            moveLeft();
            break;
        case 12 :
            moveUp();
            break;
        default :
            try {
                throw new java.lang.Exception(("+++Divide By Cucumber Error. Please Reinstall Universe" + " And Reboot +++"));
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            break;
    }
    fillRandom();
}