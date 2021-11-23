@java.lang.Override
public void diagramProfileChanged() {
    if ((content) == null)
        return ;
    
    this.setCanvasProperties();
    this.drawThumbnail();
}