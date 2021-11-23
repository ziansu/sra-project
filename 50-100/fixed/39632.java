public java.lang.String gotoDetail(java.lang.String id) {
    model.DataProcess dp = new model.DataProcess();
    javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("SelectedId", id);
    bookingIdSelected = id;
    currentBooking = dp.getBookingById(bookingIdSelected);
    currentCustomer = dp.getCustomerByIdentityNo(currentBooking.getCustomerId());
    return "detail";
}