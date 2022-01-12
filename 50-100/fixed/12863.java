@java.lang.Override
public void handle(javafx.event.ActionEvent e) {
    root.getChildren().remove(makeMove);
    spacesToMove = ((int) ((java.lang.Math.random()) * 3)) + 1;
    targetX = control.tileList.get(((curSpace) + 1)).x;
    targetY = control.tileList.get(((curSpace) + 1)).y;
    startNanoTime = java.lang.System.nanoTime();
    isRolling = true;
}