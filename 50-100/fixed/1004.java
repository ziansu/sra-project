private void randomPigPosition(lib.GameObject.ISprite sprite) {
    pigSprite.getBody().getPosition().setX(((float) (((java.lang.Math.random()) * 500) + 200)));
    pigSprite.getBody().getPosition().setY(0);
}