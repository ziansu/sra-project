private boolean spawnPlant() {
    addToMaps(new com.badlogic.neogenesis.Plant(5, new com.badlogic.gdx.math.Circle(com.badlogic.gdx.math.MathUtils.random(0, 2400), com.badlogic.gdx.math.MathUtils.random(0, 1800), 4)));
    return true;
}