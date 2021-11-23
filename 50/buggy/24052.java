public void setCellValue(int cellY, int cellX, int value) {
    java.lang.System.out.println(((("y=" + cellY) + ", x=") + cellX));
    board[cellY][cellX] = value;
}