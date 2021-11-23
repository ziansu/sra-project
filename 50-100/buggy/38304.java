public java.util.ArrayList<logic.Task> deleteTaskByIndex(int index) {
    java.util.ArrayList<logic.Task> display = bin.returnDisplay();
    logic.Task toDel = display.get((index - 1));
    bin.delete(toDel);
    display.remove((index - 1));
    bin.setDisplay(display);
    return bin.returnDisplay();
}