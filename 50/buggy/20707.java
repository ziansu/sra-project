public void moveLeft() {
    if (!(this.isWidgetParent()))
        return ;
    
    parent.getAbstractParent().addWidget(this);
    parent.forceRemoveWidget(this);
    this.disposed = false;
}