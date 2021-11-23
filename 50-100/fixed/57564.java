@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getReservations(@org.springframework.web.bind.annotation.RequestParam(value = "date", required = false)
java.lang.String dateString, org.springframework.ui.Model model) {
    java.util.Date date = null;
    if (dateString != null) {
        try {
            date = au.com.ericliu.spring_helloworld.landom.web.application.ReservationController.DATE_FORMAT.parse(dateString);
        } catch (java.text.ParseException pe) {
            date = new java.util.Date();
        }
    }else {
        date = new java.util.Date();
    }
    final java.util.List<au.com.ericliu.spring_helloworld.landom.business.domain.RoomReservation> roomReservations = reservationService.getRoomReservations(date);
    model.addAttribute("roomReservations", roomReservations);
    return "reservations";
}