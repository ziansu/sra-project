@java.lang.Override
public void setTransform(com.badlogic.gdx.math.Matrix3 transformation) {
    userTransform.set(transformation).mul(layerTransform);
    for (com.flumpgdx.display.FlumpDisplay display : displayLayers) {
        display.setTransform(userTransform);
        flumpUpdate(0);
    }
}