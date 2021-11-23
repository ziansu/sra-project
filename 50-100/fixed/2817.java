@java.lang.Override
public void setInverted(boolean b) {
    boolean changed = b != (this.inverted);
    if (!changed) {
        return ;
    }
    this.inverted = b;
    for (int i = 0; i < (this.controllerList.length); i++) {
        controllerList[i].setInverted((!(controllerList[i].getInverted())));
    }
}