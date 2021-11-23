@java.lang.Override
public void changeViewPanel() {
    if ((posPanel.getQty().compareTo(Env.ZERO)) == 0)
        changeStatus(false);
    else
        changeStatus(true);
    
    fieldQuantity.setValue(posPanel.getQty());
    fieldPrice.setValue(posPanel.getPrice());
    fieldDiscountPercentage.setValue(posPanel.getDiscountPercentage());
}