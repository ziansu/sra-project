@java.lang.Override
public boolean reset() {
    if ((level) == 10)
        game.getPlayer().addEvil();
    
    return false;
}