public void increaseAmount(javafx.event.ActionEvent evt) {
    theItem.setAmount(((theItem.getAmount()) + 1));
    lblAmount.setText(((java.lang.String.valueOf(noDec.format(theItem.getAmount()))) + (theItem.getProduct().getUnitSuffix())));
    se.chalmers.ait.dat215.project.IMatDataHandler.getInstance().getShoppingCart().fireShoppingCartChanged(theItem, false);
}