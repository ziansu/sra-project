public void undoLatestAction(se.oxidev.animtools64.ProjectObject projectObject) {
    se.oxidev.animtools64.UndoItem undoItem = undoList.get(positionInUndoArray);
    if ((undoItem.getType()) == (Const.UNDOTYPE_DRAW)) {
        se.oxidev.animtools64.AnimFrame af = projectObject.animFrameList.get(undoItem.getFrame());
        af.setData(undoItem.getData());
        if ((positionInUndoArray) > 0) {
            positionInUndoArray -= 1;
        }
    }
}