@java.lang.Override
public void tap(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y, int count, int button) {
    if ((!(player.animated)) && (!(player.isDead()))) {
        game.score.add(1);
        win();
        font.setText(game.score);
        java.lang.System.out.println(("Score = " + (game.score)));
        player.move();
        shouldJump = false;
    }
}