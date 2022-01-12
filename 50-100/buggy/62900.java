@org.springframework.web.bind.annotation.RequestMapping(value = com.queue.model.URIConstants.ADD_WORKORDER, method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
public com.queue.model.EmployeeWorkOrder addWorkOrder(@org.springframework.web.bind.annotation.RequestParam(value = "id")
long id, @org.springframework.web.bind.annotation.RequestParam(value = "date")
java.lang.String enteredDate) {
    com.queue.model.EmployeeWorkOrder empWorkOrder = null;
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd_hh:mm:ss");
    try {
        java.util.Date date = sdf.parse(enteredDate);
        empWorkOrder = queueService.addWorkOrder(id, date);
        checkBadRequest(empWorkOrder);
    } catch (java.text.ParseException ex) {
        throw new com.queue.exception.BadRequestException();
    }
    return empWorkOrder;
}