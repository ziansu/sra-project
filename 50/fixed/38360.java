private void pickedUp() {
    if (!(pickedUp)) {
        levelController.getScreenController().removeSprite(this);
        pickedUp = true;
    }
}