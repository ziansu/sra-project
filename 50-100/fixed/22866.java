protected void updateTransform() {
    model.transform.setToRotationRad(Vector3.Z, body.getAngle());
    ru.spbau.blackout.utils.Utils.fixTop(model);
    com.badlogic.gdx.math.Vector2 pos = body.getPosition();
    model.transform.setTranslation(pos.x, pos.y, height);
}