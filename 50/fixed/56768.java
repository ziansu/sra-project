public void trash() {
    if (((highLighted) != null) && (!(highLighted.isActive()))) {
        deselectHighlighted();
    }else {
        sellBoardObject(highLighted, true);
    }
    highLighted = null;
}