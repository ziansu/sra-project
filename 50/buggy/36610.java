public void setHidden(boolean hidden) {
    if ((this.hidden) == hidden)
        return ;
    
    this.hidden = hidden;
    if (hidden)
        chunk.addHidden();
    else
        chunk.removeHidden();
    
}