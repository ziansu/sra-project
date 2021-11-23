private boolean pollMovementInput() {
    io.github.bobdesaunois.amazighvillagegame.DialogManager.clear();
    if ((truePos.x) > ((Gdx.graphics.getWidth()) - 200)) {
        java.lang.System.out.println("RIGHT");
        io.github.bobdesaunois.amazighvillagegame.Game.getPlayer().moveRight();
        return true;
    }else
        if ((truePos.x) < 200) {
            java.lang.System.out.println("LEFT");
            io.github.bobdesaunois.amazighvillagegame.Game.getPlayer().moveLeft();
            return true;
        }
    
    return false;
}