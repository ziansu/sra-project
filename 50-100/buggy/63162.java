public void findColorSide1() {
    while (true) {
        if (((sensor1.red()) > 3) && ((sensor2.blue()) < 1)) {
            Thing = true;
            break;
        }
        if (((sensor1.red()) > 3) && ((sensor2.blue()) < 1)) {
            Thing = false;
            break;
        }
    } 
}