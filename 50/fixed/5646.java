public void switchOwner(cfvbaibai.cardfantasy.engine.Player newOwner) {
    if ((newOwner == null) || (newOwner == (this.owner))) {
        return ;
    }
    this.originalOwner = this.owner;
    this.owner = newOwner;
}