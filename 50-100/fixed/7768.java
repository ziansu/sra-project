void CurrentPosUpdate() {
    if (this.isEmpty()) {
        CurrentPosX = sg.util.FastLinkedList.MARGIN;
        CurrentPosY = 0;
    }else
        if (!(currentNode.nodeText.getText().equals("\n"))) {
            CurrentPosX = (currentNode.nodeText.getX()) + (java.lang.Math.round(currentNode.nodeText.getLayoutBounds().getWidth()));
            CurrentPosY = currentNode.nodeText.getY();
        }else {
            CurrentPosX = sg.util.FastLinkedList.MARGIN;
        }
    
}