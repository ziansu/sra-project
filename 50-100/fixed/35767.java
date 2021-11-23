@java.lang.Override
public void gravityPull(java.util.ArrayList<model.WorldObject> data) {
    for (model.WorldObject obj : data) {
        if (obj instanceof model.Moveable) {
            util.Vector2D distance = position.sub(obj.getPosition());
            ((model.Moveable) (obj)).accelerate(distance.normalize().scale(((((gravity_constant) * (mass)) * (obj.getMass())) / (distance.lengthsquared()))));
        }
    }
}