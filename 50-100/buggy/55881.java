@java.lang.Override
public void exitMovable(game.roles.Movable movable) {
    weight -= movable.getWeight();
    if ((((myGate) != null) && (!(myGate.isClosed()))) && ((weight) < (limit))) {
        myGate.close();
    }
}