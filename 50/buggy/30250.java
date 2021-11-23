@java.lang.Override
public void checkBehaviors() {
    java.lang.System.out.println("Updated star");
    if ((getY()) >= 540) {
        game.removeStar(this);
    }
}