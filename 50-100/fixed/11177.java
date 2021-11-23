private void checkFirePrimary() {
    if ((input.isFirePrimaryWeapon()) && ((counter) > 30)) {
        model.Bubble bubble = new model.Bubble(getX(), getY(), 0, 0, 0, 0, facingRight, levelController);
        bubbles.add(bubble);
        levelController.getScreenController().addToSprites(bubble);
        counter = 0;
    }else {
        (counter)++;
    }
}