private void attemptToAddProduct(java.lang.String message) {
    try {
        currentSlot = productController.getSlot(message);
        boolean added = addProductToOrder(currentSlot);
        if (added && ((currentState) != (vendingmachine.VendingMachine.MachineState.CUSTOMER)))
            setCurrentState(vendingmachine.VendingMachine.MachineState.CUSTOMER);
        
        inputController.display(Messages.PRODUCT_ADDED);
    } catch (java.lang.Exception e) {
        inputController.display(Messages.BAD_INPUT);
    }
}