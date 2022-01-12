public java.lang.String gotoDetail(java.lang.String id) {
    java.lang.Object obj = javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("SelectedId");
    if (obj != null) {
        java.lang.String selectedId = ((java.lang.String) (obj));
        bookingIdSelected = selectedId;
        model.DataProcess dp = new model.DataProcess();
        currentBooking = dp.getBookingById(bookingIdSelected);
        currentCustomer = dp.getCustomerByIdentityNo(currentBooking.getCustomerId());
    }
    return "detail";
}