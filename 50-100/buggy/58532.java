@java.lang.SuppressWarnings(value = { "unchecked" , "rawtypes" })
@java.lang.Override
public com.badlogic.gdx.ai.utils.Location newLocation() {
    com.badlogic.gdx.math.Vector2 copy = pos.cpy();
    return new entity.Player(copy.add(((int) ((java.lang.Math.random()) * 50)), ((int) ((java.lang.Math.random()) * 50))), new com.badlogic.gdx.math.Vector2());
}