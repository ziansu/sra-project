public static void addBubble(int size, int x, int y, double vx, double vy) {
    Group_24.BubbleTrouble.Bubble newBubble = new Group_24.BubbleTrouble.Bubble(size, x, y, vx, vy);
    Group_24.BubbleTrouble.Room.newBubbles.add(newBubble);
}