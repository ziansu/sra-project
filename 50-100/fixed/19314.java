@java.lang.Override
public edu.scu.api.ApiResponse<java.lang.Boolean> isGoogleCalendarImported(java.lang.String personId) {
    edu.scu.model.Person person = null;
    try {
        person = Backendless.Data.of(edu.scu.model.Person.class).findById(personId);
    } catch (com.backendless.exceptions.BackendlessException exception) {
        return new edu.scu.api.ApiResponse(edu.scu.api.ApiImpl.FAIL_EVENT, ("Error code:" + (exception.getCode())));
    }
    return new edu.scu.api.ApiResponse(edu.scu.api.ApiImpl.SUCCESS_EVENT, "", person.getIsGoogleCalendarImported());
}