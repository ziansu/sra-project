protected void registerDrag(com.algebraweb.editor.client.graphcanvas.GraphNode n, int offsetX, int offsetY) {
    this.dragNode = n;
    this.dragOffsetX = offsetX - 5;
    this.dragOffsetY = offsetY - 5;
}