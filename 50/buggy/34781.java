@org.springframework.web.bind.annotation.ExceptionHandler(value = java.sql.SQLException.class)
public java.lang.String handleSQLException(javax.servlet.http.HttpServletRequest request, java.lang.Exception ex) {
    uk.ac.ebi.ep.controller.GlobalControllerAdvisor.logger.error(((("SQLException Occured:: URL=" + (request.getRequestURL())) + " :: ") + (ex.getLocalizedMessage())));
    return "error";
}