private void drawPowers() throws com.sem.btrouble.view.SlickException {
    for (com.sem.btrouble.view.PowerUp power : com.sem.btrouble.view.Model.getShortPower()) {
        power.draw();
    }
}