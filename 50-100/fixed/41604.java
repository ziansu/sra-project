public com.badlogic.gdx.math.Vector2 degreesConversion(float degrees) {
    float xValue = ((float) ((java.lang.Math.cos(java.lang.Math.toRadians(degrees))) * (38 / (com.jishd.fight.FightGame.PPM))));
    float yValue = ((float) ((java.lang.Math.sin(java.lang.Math.toRadians(degrees))) * (38 / (com.jishd.fight.FightGame.PPM))));
    return new com.badlogic.gdx.math.Vector2(xValue, yValue);
}