public void onEveryFrame(int msecElapsed) {
    Unit.msecElapsed = msecElapsed;
    java.util.Iterator<hkust.comp3111h.ballcraft.Unit> i = Unit.units.iterator();
    while (i.hasNext()) {
        i.next().moved = false;
    } 
    i = Unit.units.iterator();
    while (i.hasNext()) {
        hkust.comp3111h.ballcraft.Unit temp = i.next();
        if (!(temp.moved)) {
            temp.moved = true;
            temp.move();
        }
    } 
}