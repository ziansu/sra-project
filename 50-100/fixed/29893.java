@java.lang.Override
public void init(main.GameState lastState) {
    frameUnit = (main.MastermindState.gsm.currentlyTesting) ? 480 : 0;
    int boardY = ((GamePanel.HEIGHT) * 7) / 16;
    board = new main.MastermindBoard(0, boardY, GamePanel.WIDTH, ((GamePanel.HEIGHT) - boardY));
}