public static void main(java.lang.String[] args) {
    com.badlogic.gdx.math.Vector3 initBallPos = new com.badlogic.gdx.math.Vector3(0, 0, 1);
    physics.testing.GravityNormalForceTest test = new physics.testing.GravityNormalForceTest(initBallPos);
    com.badlogic.gdx.math.Vector3 hitForce = new com.badlogic.gdx.math.Vector3(10000, 0, 0);
    test.init();
    int iterations = 10;
    boolean truth = true;
    for (int cnt = 0; cnt < iterations; ++cnt) {
        test.updateEngine();
        test.printBallPosition();
    }
    test.close();
}