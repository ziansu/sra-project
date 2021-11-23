@java.lang.Override
public int getNoCollisionPercentage() {
    return ((int) ((((size) - (collisionInfo.collisionCnt)) * 100) / (size)));
}