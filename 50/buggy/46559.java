public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.System.out.println("left pressed");
    tetris.GameRunner.tetrisSystem.moveActiveTetromino((-1), 0, 0);
}