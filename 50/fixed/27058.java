@java.lang.Override
public void update(int delta) throws org.newdawn.slick.SlickException {
    player1Input.poll();
    player2Input.poll();
    super.update(delta);
}