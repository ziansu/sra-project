public static void handle(final com.rharel.pong.core.Ball ball, final com.rharel.pong.core.Paddle paddle) {
    final com.rharel.pong.geometry.BoundingBox box = paddle.getBoundingBox();
    if (com.rharel.pong.geometry.Collision.detect(ball, box)) {
        com.rharel.pong.geometry.Collision.separate(ball, box);
        com.rharel.pong.geometry.Collision.bounce(ball, box);
    }
}