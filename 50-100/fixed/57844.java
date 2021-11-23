@org.springframework.web.bind.annotation.RequestMapping(value = { "getAppointment/{doctorId}/{appointmentStartTime}" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView getAppointment(@org.springframework.web.bind.annotation.PathVariable
java.lang.Integer doctorId, @org.springframework.web.bind.annotation.PathVariable
java.lang.Long appointmentStartTime) throws com.mahdi.myapp.exception.DocException {
    org.springframework.web.servlet.ModelAndView mv = new org.springframework.web.servlet.ModelAndView("getAppointmentPage");
    com.mahdi.myapp.model.UserProfile doctorProfile = userService.getRowById(doctorId);
    com.mahdi.myapp.model.UserProfile patientProfile = new com.mahdi.myapp.model.UserProfile();
    mv.addObject("user", patientProfile);
    mv.addObject("doctor", doctorProfile);
    com.mahdi.myapp.model.Bookings booking = com.mahdi.myapp.util.DocUtils.getBooking(appointmentStartTime, doctorProfile, patientProfile, "Reason", bookingStatusService.getRowById(1));
    mv.addObject("appointmentStartTime", booking);
    return mv;
}