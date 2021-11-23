public java.util.ArrayList<logic.Task> deleteTaskByIndex(int index) {
    java.util.ArrayList<logic.Task> display = bin.returnDisplay();
    logic.Task toDel = new logic.Task();
    toDel = display.get((index - 1));
    bin.delete(toDel);
    bin.setDisplay();
    return bin.returnDisplay();
}