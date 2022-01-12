public void run() {
    ball.setSpeed(new ro.licj.magnus.util.Vector(3.0, 10.0));
    trajectory.add(new ro.licj.magnus.util.Point(ball.getPosition().x, ball.getPosition().y));
    try {
        renderer.init(ball, trajectory);
        loop();
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println(("An error has occured: " + (ex.toString())));
        ex.printStackTrace();
    } finally {
        renderer.terminate();
    }
}