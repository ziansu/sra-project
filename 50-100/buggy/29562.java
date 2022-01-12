public static void main(java.lang.String[] args) {
    com.badlogic.gdx.math.Vector3 initBallPos = new com.badlogic.gdx.math.Vector3((-20), 5, (-20));
    physics.testing.MovementTest test = new physics.testing.MovementTest(initBallPos);
    com.badlogic.gdx.math.Vector3 hitForce = new com.badlogic.gdx.math.Vector3(100, 0, 0);
    test.hitBall(hitForce);
    test.display();
}