private static boolean detect(final com.rharel.pong.core.Ball ball, final com.rharel.pong.geometry.BoundingBox box) {
    final com.rharel.pong.geometry.Vector2 contact = ball.position.clamp(new com.rharel.pong.geometry.Vector2(box.getLeft(), box.getBottom()), new com.rharel.pong.geometry.Vector2(box.getRight(), box.getTop()));
    final float distanceSquared = ball.position.subtract(contact).length2();
    return distanceSquared < ((ball.radius) * (ball.radius));
}