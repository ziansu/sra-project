public void movement(it.polimi.ingsw.DiNapoliDiNardo.model.Box destination) {
    if (adrenalized) {
        if (isValidDoubleMovement(destination)) {
            this.position = destination;
            this.adrenalized = false;
        }else {
            java.lang.System.out.println("Not a valid movement, you'll stand still");
        }
    }else {
        if (isValidSingleMovement(destination))
            this.position = destination;
        else {
            java.lang.System.out.println("Not a valid movement, you'll stand still");
        }
    }
    if ((this.position) instanceof it.polimi.ingsw.DiNapoliDiNardo.model.DangerousBox) {
        game.drawSectorCard(this);
    }
}