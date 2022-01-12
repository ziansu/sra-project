public void reenableComponent() {
    shipCompElem.enable();
    shipCompElem.findElementByName(stellarclicker.app.ShipComponentElementController.GREEN_BAR_ID).setConstraintX(new de.lessvoid.nifty.tools.SizeValue("-100%"));
    shipCompElem.findElementByName(stellarclicker.app.ShipComponentElementController.RED_BAR_ID).setConstraintX(new de.lessvoid.nifty.tools.SizeValue("-100%"));
}