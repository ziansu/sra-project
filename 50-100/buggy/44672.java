private void move(com.knightnight.game.Util.Direction dir) {
    lcf = 0;
    slimeState = com.knightnight.game.Objects.Slime.SlimeState.WALKING;
    switch (dir) {
        case LEFT :
            move((-1), 0);
            isFlipped = true;
            break;
        case RIGHT :
            move(1, 0);
            isFlipped = false;
            break;
        case UP :
            move(0, 1);
            isFlipped = false;
            break;
        case DOWN :
            move(0, (-1));
            isFlipped = true;
            break;
        default :
            break;
    }
}