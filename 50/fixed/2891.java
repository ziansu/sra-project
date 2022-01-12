public void addServerUpdate(java.lang.Object o) {
    if (o == null)
        return ;
    
    this.outgoingUpdateStack.push(o);
}