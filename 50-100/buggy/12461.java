public final void setTransferable(eu.mihosoft.vrl.visual.Transferable dragginObj) {
    this.draggingObj = dragginObj;
    draggingObj.setSourceObject(this);
    this.add(draggingObj);
    draggingObj.setLocation(0, 0);
    draggingObj.setSize((((int) (this.getSize().getWidth())) - 1), (((int) (this.getSize().getHeight())) - 1));
}