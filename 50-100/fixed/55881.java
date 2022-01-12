@java.lang.Override
public void exitMovable(game.roles.Movable movable) {
    if ((weight) != 0) {
        weight -= movable.getWeight();
    }
    if ((((myGate) != null) && (!(myGate.isClosed()))) && ((weight) < (limit))) {
        myGate.close();
    }
}