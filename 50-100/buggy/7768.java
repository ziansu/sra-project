void CurrentPosUpdate() {
    if (!(currentNode.nodeText.getText().equals("\n"))) {
        CurrentPosX = (currentNode.nodeText.getX()) + (java.lang.Math.round(currentNode.nodeText.getLayoutBounds().getWidth()));
        CurrentPosY = currentNode.nodeText.getY();
    }else {
        CurrentPosX = sg.util.FastLinkedList.MARGIN;
        double deltaH = java.lang.Math.round(currentNode.pre.nodeText.getLayoutBounds().getHeight());
        CurrentPosY += deltaH;
    }
}