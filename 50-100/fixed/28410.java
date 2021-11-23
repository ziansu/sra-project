public void setGhostEffectTo(java.lang.Number amount) {
    if ((amount.intValue()) < 0) {
        amount = 0;
    }else
        if ((amount.intValue()) > 100) {
            amount = 100;
        }
    
    ghostEffect = amount.intValue();
    displayCostume();
}