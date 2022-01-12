public void update() {
    x = 100;
    y = Game.getSafeY();
    java.lang.System.out.println(("this is y: " + (y)));
    java.lang.System.out.println(("queue size: " + (Game.safeQueue.size())));
    java.lang.System.out.println(Game.safeQueue);
}