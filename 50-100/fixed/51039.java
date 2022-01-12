public void reenableComponent() {
    this.shipCompElem.enable();
    this.shipCompElem.findElementByName(stellarclicker.app.ShipComponentElementController.LEVEL_BUTTON_ID).enable();
    this.shipCompElem.findElementByName(stellarclicker.app.ShipComponentElementController.GREEN_BAR_ID).setConstraintX(new de.lessvoid.nifty.tools.SizeValue("-120%"));
    this.shipCompElem.findElementByName(stellarclicker.app.ShipComponentElementController.RED_BAR_ID).setConstraintX(new de.lessvoid.nifty.tools.SizeValue("-120%"));
    shipCompElem.layoutElements();
}