@io.swagger.annotations.ApiOperation(value = "Get schedule")
@io.swagger.annotations.ApiResponses(value = { @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request", response = com.intive.patronage.toz.error.ArgumentErrorResponse.class) })
@com.intive.patronage.toz.schedule.GetMapping
@com.intive.patronage.toz.schedule.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public com.intive.patronage.toz.schedule.ScheduleView getSchedule(@io.swagger.annotations.ApiParam(value = "Date in UTC, format: yyyy-MM-dd", required = true)
@org.springframework.format.annotation.DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
@com.intive.patronage.toz.schedule.RequestParam(value = "from")
java.time.LocalDate from, @io.swagger.annotations.ApiParam(value = "Date in UTC, format: yyyy-MM-dd", required = true)
@org.springframework.format.annotation.DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
@com.intive.patronage.toz.schedule.RequestParam(value = "to")
java.time.LocalDate to) {
    return new com.intive.patronage.toz.schedule.ScheduleView(null, null);
}