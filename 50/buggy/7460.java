private void undoEditEndTime(int index, java.time.LocalDateTime endtTime) {
    logic.Undo u = new logic.Undo();
    u.setCommand("editEndTime");
    u.setIndex(index);
    u.setEndTime(endtTime);
    UndoList.push(u);
}