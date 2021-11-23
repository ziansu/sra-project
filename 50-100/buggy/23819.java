public static void handle(final com.rharel.pong.core.Ball ball, final com.rharel.pong.core.Paddle paddle) {
    final com.rharel.pong.geometry.BoundingBox box = paddle.getBoundingBox();
    final com.rharel.pong.geometry.Vector2 contactPoint = com.rharel.pong.geometry.Collision.detect(ball, box);
    if (contactPoint == null) {
        return ;
    }
    com.rharel.pong.geometry.Collision.separate(ball, contactPoint);
    com.rharel.pong.geometry.Collision.bounce(ball, box);
}