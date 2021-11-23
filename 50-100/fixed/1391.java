public void setVisible(boolean visible) {
    if ((this.visible) == visible)
        return ;
    
    needToRecalcMatrix = true;
    if ((!(this.visible)) && visible) {
        this.visible = true;
        tr.mainRenderer.get().temporarilyMakeImmediatelyRelevant(this);
    }else
        this.visible = visible;
    
}