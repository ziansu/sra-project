public com.goblet.gameEngine.Box getAttackHitbox() {
    switch (currentAttackDirection) {
        default :
        case DOWN :
        case UP :
            return HorizontalAttack;
        case RIGHT :
        case LEFT :
            return VerticalAttack;
    }
}