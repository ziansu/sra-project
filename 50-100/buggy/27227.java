@java.lang.Override
public java.util.List<de.pentasys.SilverPen.model.booking.BookingItem> getBookingList(de.pentasys.SilverPen.model.User user, de.pentasys.SilverPen.service.TimeService.TIME_BOX box, java.util.Date pinDate, de.pentasys.SilverPen.service.TimeService.SORT_TYPE sort) {
    java.util.LinkedList<de.pentasys.SilverPen.model.booking.BookingItem> items = new java.util.LinkedList<de.pentasys.SilverPen.model.booking.BookingItem>();
    for (de.pentasys.SilverPen.service.TimeService srv : childTimeService) {
        java.util.LinkedList<de.pentasys.SilverPen.model.booking.BookingItem> newItems = new java.util.LinkedList<de.pentasys.SilverPen.model.booking.BookingItem>(srv.getBookingList(user, box, pinDate, sort));
        combine(items, newItems, sort);
    }
    return items;
}