@org.springframework.security.access.prepost.PreAuthorize(value = "hasAuthority('ADMIN')")
@com.schweizerischebundesbahnen.restcontroller.RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
public org.springframework.http.ResponseEntity<?> deleteSchedule(@com.schweizerischebundesbahnen.restcontroller.PathVariable
java.lang.String id) {
    if (!(id.equals(""))) {
        scheduleService.delete(scheduleService.findScheduleById(java.lang.Long.valueOf(id)));
        log.info("Schedule was deleted successfully");
        sendMessageForUpdating();
        return org.springframework.http.ResponseEntity.ok("Schedule was deleted");
    }else {
        return new org.springframework.http.ResponseEntity("Mistake with deleting schedule", org.springframework.http.HttpStatus.BAD_REQUEST);
    }
}