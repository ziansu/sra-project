@java.lang.Override
public void update(SlickGui.GameContainer gameContainer, int i) throws SlickGui.SlickException {
    java.util.ArrayList<SlickGui.Tank> tanks = map.getTanks();
    bulletpack = new java.util.ArrayList<>();
    int j = 1;
    for (SlickGui.Tank tank : tanks) {
        bulletpack.add(new SlickGui.Bullet(j));
        j++;
    }
}