@java.lang.Override
public void handle(javafx.event.ActionEvent e) {
    root.getChildren().remove(makeMove);
    spacesToMove = ((int) ((java.lang.Math.random()) * 3)) + 1;
    (curSpace)++;
    targetX = control.tileList.get(curSpace).x;
    targetY = control.tileList.get(curSpace).y;
    startNanoTime = java.lang.System.nanoTime();
    isRolling = true;
}