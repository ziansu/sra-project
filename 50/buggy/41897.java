@java.lang.Override
public void run() {
    Gdx.app.log("Timer", "for Towerss!");
    com.betmansmall.game.gameLogic.GameField.attackCreep(getPosition());
}