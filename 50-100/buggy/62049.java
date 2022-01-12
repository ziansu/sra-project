@com.inva.hipstertest.freemarker.controllers.RequestMapping(value = "freemarker/teacher/schedule/schedule", method = RequestMethod.POST)
@com.inva.hipstertest.freemarker.controllers.ResponseBody
public java.util.List<com.inva.hipstertest.service.dto.ScheduleDTO> getScheduleBySearchCriteria(@com.inva.hipstertest.freemarker.controllers.RequestBody
com.inva.hipstertest.freemarker.searchcriteria.ScheduleSearchCriteria scheduleSearchCriteria) {
    log.debug("Create Ajax request to search schedule by search criteria");
    org.apache.commons.lang3.Validate.notNull(scheduleSearchCriteria.getId(), "Field 'id' on scheduleSearchCriteria can not be null.");
    org.apache.commons.lang3.Validate.notNull(scheduleSearchCriteria.getScheduleFilterType(), "Field 'Schedule type' on scheduleSearchCriteria can not be null.");
    org.apache.commons.lang3.Validate.notNull(scheduleSearchCriteria.getDate(), "Field 'Date' on scheduleSearchCriteria can not be null.");
    return scheduleService.getScheduleBySearchCriteria(scheduleSearchCriteria);
}