@java.lang.Override
public void onCollision(com.sem.btrouble.controller.Collidable b) {
    switch (com.sem.btrouble.controller.CollisionHandler.checkCollisionSideX(this, b)) {
        case LEFT :
            this.bounceXLeft();
            break;
        case RIGHT :
            this.bounceXRight();
            break;
        default :
            break;
    }
    switch (com.sem.btrouble.controller.CollisionHandler.checkCollisionSideY(this, b)) {
        case TOP :
            this.bounceYUp();
            break;
        case BOTTOM :
            this.bounceYDown();
            break;
        default :
            break;
    }
}