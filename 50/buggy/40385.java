@java.lang.Override
public void update(java.util.Observable o, java.lang.Object arg) {
    if (arg instanceof dw317.hotel.business.interfaces.Customer)
        displayCustomerInfo(o, arg);
    
    if (arg instanceof group42.hotel.data.ReservationListDB)
        displayReservationInfo(o, arg);
    
}