@java.lang.Override
protected void askForUpdate() {
    if ((this.currentRunningProtocol) != null) {
        this.model.refreshList(this.myContext, currentFarm.id, this.currentRunningProtocol.id);
    }else
        this.model.refreshList(this.myContext, currentFarm.id);
    
}