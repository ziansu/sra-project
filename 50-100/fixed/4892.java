public void lifeCheck(edu.oregonstate.cs361.battleship.Ship in) {
    shipSunk = false;
    if (in.isAlive()) {
        if ((in.getHealth()) == 0) {
            in.makeDed();
            shipSunk = true;
        }else {
            shipSunk = false;
        }
    }else {
        shipSunk = false;
    }
}