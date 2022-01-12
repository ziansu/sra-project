@org.springframework.web.bind.annotation.RequestMapping(value = "/{id}/create")
public fr.istic.iodeman.model.Unavailability createUnavailability(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.Integer id, @org.springframework.web.bind.annotation.RequestParam(value = "person")
java.lang.String uidperson, @org.springframework.web.bind.annotation.RequestParam(value = "periodStart")
@org.springframework.format.annotation.DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
java.util.Date periodStart, @org.springframework.web.bind.annotation.RequestParam(value = "periodEnd")
@org.springframework.format.annotation.DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
java.util.Date periodEnd) {
    fr.istic.iodeman.model.TimeBox period = new fr.istic.iodeman.model.TimeBox(new org.joda.time.DateTime(periodStart).toDate(), new org.joda.time.DateTime(periodEnd).toDate());
    fr.istic.iodeman.model.Unavailability unavailability = unavailabilityService.create(id, uidperson, period);
    return unavailability;
}