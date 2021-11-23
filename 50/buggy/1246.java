public swingGUI.VideoTape getSetPrev() {
    if ((current.getPrev()) == null) {
        return null;
    }else {
        current = current.getPrev();
        return current.getTape();
    }
}