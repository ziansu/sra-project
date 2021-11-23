public void update() {
    target.force = target.position.subtract(new maths.Vector3f(0, 5, 10)).scale((-0.1F));
    for (int i = 0; i < (objectList.size()); i++) {
        java.lang.Object object = objectList.get(i);
        object.translate(object.velocity);
        object.physic();
    }
    maths.BoundingBox.collide(object.ObjectManager.ball, target, object.ObjectManager.ball.velocity, target.velocity);
    c += (java.lang.Math.PI) / 500;
}