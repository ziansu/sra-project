@org.springframework.web.bind.annotation.RequestMapping(value = "/therapiePlanDateRange", method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = "application/json")
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<project.model.Appointment> therapiePlanPage(@org.springframework.web.bind.annotation.RequestBody
java.util.HashMap<java.lang.String, java.lang.String> dateRangeProp) throws java.text.ParseException {
    java.lang.String fromDateString = dateRangeProp.get("fromDate");
    java.lang.String toDateString = dateRangeProp.get("toDate");
    java.util.Date fromDate = dateFormat.parse(fromDateString);
    java.util.Date toDate = dateFormat.parse(toDateString);
    java.util.List<project.model.Appointment> appointmentsForCurrentWeek = appointmentService.findByDateBetween(fromDate, toDate);
    java.lang.System.out.println(appointmentsForCurrentWeek);
    return appointmentsForCurrentWeek;
}