@java.lang.Override
public void gravityPull(model.WorldCollection data) {
    for (model.WorldObject obj : data.getCollection()) {
        if (obj instanceof model.Moveable) {
            util.Vector2D distance = position.sub(obj.getPosition());
            ((model.Moveable) (obj)).accelerate(distance.normalize().scale(((((gravity_constant) * (mass)) * (obj.getMass())) / (distance.lengthsquared()))));
        }
    }
}