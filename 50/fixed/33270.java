@com.epam.rest.ExceptionHandler(value = org.springframework.dao.DataAccessException.class)
@com.epam.rest.ResponseStatus(value = org.springframework.http.HttpStatus.NOT_FOUND)
@com.epam.rest.ResponseBody
public java.lang.String handleDataAccessException(org.springframework.dao.DataAccessException ex) {
    com.epam.rest.RestErrorHandler.LOGGER.debug(("Handling DataAccessException: " + ex));
    return ex.getLocalizedMessage();
}