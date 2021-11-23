@java.lang.Override
public void die(Server.Entity toMourn) {
    entities.remove(toMourn);
    map.getSquare(toMourn.getPosition()).remove(toMourn);
    if (toMourn.isPlayer)
        players.remove(toMourn);
    
}