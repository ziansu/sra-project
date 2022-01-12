@org.junit.Test
public void bubbleBubbleTopCollision() {
    com.sem.btrouble.model.Bubble otherBubble = new com.sem.btrouble.model.Bubble(10, com.sem.btrouble.BubbleCollisionTests.CENTER_X, ((com.sem.btrouble.BubbleCollisionTests.CENTER_Y) - 10));
    bubble.move();
    otherBubble.move();
    bubble.getCollideActions().get(com.sem.btrouble.model.Bubble.class).onCollision(otherBubble);
    org.junit.Assert.assertTrue(((bubble.getVelocityY()) > 0));
}