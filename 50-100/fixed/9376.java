public de.tuhh.diss.plotbot.Plottable select() {
    int selection = -1;
    do {
        selection = menu.select();
    } while (selection < 0 );
    while (Button.ENTER.isDown()) {
    } 
    de.tuhh.diss.plotbot.Plottable toDraw = null;
    if (selection == 0) {
        toDraw = new de.tuhh.diss.plotbot.Anchor();
    }
    if (selection == 1) {
    }
    return toDraw;
}