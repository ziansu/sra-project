public void moveGamepiece(game.Gamepiece gamepiece, int newX, int newY) {
    if (gamepiece instanceof game.Rook) {
        for (int i = (gamepiece.getY()) - 1; i >= newY; i--) {
            if (tileHasGamepiece(newX, i)) {
                return ;
            }
        }
    }else
        if (gamepiece instanceof game.Bishop) {
        }
    
    if (tileHasGamepiece(newX, newY)) {
    }else {
        gamepiece.move(newX, newY);
    }
}