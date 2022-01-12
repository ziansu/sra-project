public boolean apply(java.lang.String[] t) {
    if ((this.nextCommand) == null)
        return this.hasBeenAnswered = false;
    
    if (this.hasBeenAnswered = this.nextCommand.apply(t))
        this.setChanged();
    
    this.notifyObservers(new java.lang.Object[]{ this.nextCommand.getClass() , t });
    return hasBeenAnswered;
}