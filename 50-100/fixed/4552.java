public static void playCollisionNoise() {
    if ((java.lang.Math.abs((((com.mygdx.game.PlayScreen.taxi.getVelocity()[0]) * (com.mygdx.game.PlayScreen.taxi.getOrientation()[0])) + ((com.mygdx.game.PlayScreen.taxi.getVelocity()[1]) * (com.mygdx.game.PlayScreen.taxi.getOrientation()[1]))))) > 0.7) {
        com.mygdx.game.PlayScreen.gameSoundPlayer.playCollisionNoise();
    }
}