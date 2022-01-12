private void handleNextStep() {
    if ((stepList.get(currentstep)) instanceof com.gwt.wizard.client.steps.ShareStep) {
        if (((com.gwt.wizard.client.core.Wizard.EXISTING_BOOKINGS_ON_ROUTE) == null) || ((com.gwt.wizard.client.core.Wizard.EXISTING_BOOKINGS_ON_ROUTE.size()) == 0)) {
            (currentstep)++;
        }
    }
    if ((stepList.get(currentstep)) instanceof com.gwt.wizard.client.steps.CreditCardStep) {
        if (OrderType.SHARE.equals(com.gwt.wizard.client.core.Wizard.BOOKINGINFO.getOrderType())) {
            (currentstep)++;
        }
    }
}