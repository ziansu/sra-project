public void setShipFrom(com.stamps.web.print.postage.modules.shipFrom.ReturnAddressBean returnAddressBean) {
    if ((shippingAddressesModule) == null)
        shippingAddressesModule = new com.stamps.web.print.postage.modules.shipFrom.ManageShippingAddressesModule(driver);
    
    shippingAddressesModule.setShipFrom(returnAddressBean);
}