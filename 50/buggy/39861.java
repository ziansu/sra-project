public void nextColor() {
    if ((++(position)) > (com.blundell.tut.LedStrip.Color.RAINBOW.length)) {
        position = 0;
    }
    changeColor(com.blundell.tut.LedStrip.Color.RAINBOW[position]);
}