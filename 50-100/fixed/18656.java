public void eat() {
    if ((mapUtils.MapHandlerAdvanced.eatFromSquare(xPos, yPos)) && ((hunger) == 0)) {
        mapUtils.MapHandlerAdvanced.decreasePlantHealth(xPos, yPos, 50);
        this.energy += 10;
        if ((this.energy) >= 100) {
            this.energy = 100;
        }
    }
    mapUtils.MapHandlerAdvanced.decreasePlantHealth(xPos, yPos, 50);
}