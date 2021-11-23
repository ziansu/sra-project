public void setStateNavBackForwardButtons(ch.zbw.lernkartei.model.Register reg, int index) {
    if (index == 0)
        this.buttonNavBack.setEnabled(false);
    else
        this.buttonNavBack.setEnabled(true);
    
    if (index < (reg.getNumberOfCards()))
        setStateButtonForward(true);
    else
        setStateButtonForward(false);
    
}