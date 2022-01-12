public void act() {
    if ((Play.dif) != 4) {
        checkDif();
        if (((lose) == false) && ((getX()) != 533)) {
            i = (i) + 1;
            setImage((("st" + ((i) % 4)) + ".png"));
        }
        (cd)++;
        losing();
    }
}