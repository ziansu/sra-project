@org.springframework.web.bind.annotation.RequestMapping(value = "/updateSeatsFormDisplay", method = { org.springframework.web.bind.annotation.RequestMethod.GET })
public java.lang.String timeData(org.springframework.ui.Model model) {
    java.util.List<com.nttdata.pune.training.bookmytable.model.beans.Seats> timeSlotData = operationService.selectTimeSlots();
    java.lang.String dateTime = timeSlotData.get(0).getBooking_date();
    java.lang.String date;
    date = dateTime.substring(0, 10);
    com.nttdata.pune.training.bookmytable.model.beans.Seats seat = new com.nttdata.pune.training.bookmytable.model.beans.Seats();
    model.addAttribute("date", date);
    return "admins/updateSeatsForm";
}