@java.lang.Override
public void onCollision(com.sem.btrouble.controller.Collidable b) {
    switch (com.sem.btrouble.controller.CollisionHandler.checkCollisionSideX(this, b)) {
        case LEFT :
            bounceXLeft();
            break;
        case RIGHT :
            bounceXRight();
            break;
        default :
            break;
    }
    switch (com.sem.btrouble.controller.CollisionHandler.checkCollisionSideY(this, b)) {
        case TOP :
            bounceYUp();
            break;
        case BOTTOM :
            bounceYDown();
            break;
        default :
            break;
    }
}