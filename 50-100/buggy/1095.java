public edu.oregonstate.cs361.battleship.Coords getComputerFireCoords() {
    java.util.Random randNum = new java.util.Random();
    if ((computerRemainingFirableCoords.size()) != 0) {
        int shotArrayNum = randNum.nextInt(computerRemainingFirableCoords.size());
        edu.oregonstate.cs361.battleship.Coords shot = computerRemainingFirableCoords.get(shotArrayNum);
        computerRemainingFirableCoords.remove(shotArrayNum);
        java.lang.System.out.println((((shot.getAcross()) + ", ") + (shot.getDown())));
        return shot;
    }else {
        return null;
    }
}