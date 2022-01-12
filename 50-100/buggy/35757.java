@org.junit.Test
public void bubbleBubbleLeftCollision() {
    com.sem.btrouble.model.Bubble otherBubble = new com.sem.btrouble.model.Bubble(10, ((com.sem.btrouble.BubbleCollisionTests.CENTER_X) + 10), com.sem.btrouble.BubbleCollisionTests.CENTER_Y);
    bubble.getCollideActions().get(com.sem.btrouble.model.Bubble.class).onCollision(otherBubble);
    org.junit.Assert.assertTrue(((bubble.getVelocityX()) < 0));
    org.junit.Assert.assertTrue(((otherBubble.getVelocityX()) > 0));
}