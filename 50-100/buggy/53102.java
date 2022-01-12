@java.lang.Override
public void notification(nl.tudelft.pixelperfect.game.Game game, nl.tudelft.pixelperfect.game.Scene scene) {
    scene.getAsteroidEventLabel().setText(("ASTEROID DAMAGE: " + (java.lang.String.valueOf(getParameters().get("locationDamageImpact").getValue()))));
    if (!(notifiedFlag)) {
        notifiedFlag = true;
        game.getAudioPlayer().playSound("AsteroidEvent", false);
    }
}