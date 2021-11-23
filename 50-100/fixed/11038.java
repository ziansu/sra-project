@com.inva.hipstertest.freemarker.controllers.RequestMapping(value = "/freemarker/teacher/schedule/forms-wp", method = RequestMethod.POST)
@com.inva.hipstertest.freemarker.controllers.ResponseBody
public java.util.List<com.inva.hipstertest.service.dto.FormDTO> getAvailableFormsBySearchCriteria(@com.inva.hipstertest.freemarker.controllers.RequestBody
com.inva.hipstertest.freemarker.searchcriteria.SearchCriteria searchCriteria) {
    org.apache.commons.lang3.Validate.notNull(searchCriteria.getLessonPosition(), "Field 'lessonPosition' on formSearchCriteria can not be null.");
    org.apache.commons.lang3.Validate.notNull(searchCriteria.getDate(), "Field 'Date' on  formSearchCriteria can not be null.");
    if ((searchCriteria.getId()) != null) {
        return formService.findAllAvailablePlusOneById(searchCriteria);
    }
    return formService.findAvailableFormsByCurrentSchoolAndSearchCriteria(searchCriteria);
}