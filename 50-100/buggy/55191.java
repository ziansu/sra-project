@org.springframework.web.bind.annotation.ExceptionHandler(value = java.lang.Exception.class)
public ge.gov.tbilisi.map.databeans.ResponseBodyWrapper handleException(javax.servlet.http.HttpServletRequest request, java.lang.Exception exp) {
    java.lang.String errMsg = ge.gov.msda.tbilisimap.utils.exception.ExceptionUtils.getExceptionUserText(exp);
    if (exp instanceof java.sql.SQLException) {
        java.sql.SQLException ex = ((java.sql.SQLException) (exp));
        java.lang.System.out.println(ex.getCause().getMessage());
    }
    ge.gov.tbilisi.map.databeans.ResponseBodyWrapper resp = new ge.gov.tbilisi.map.databeans.ResponseBodyWrapper();
    resp.setSuccess(false);
    resp.setSessionValid(true);
    resp.setErrorText(errMsg);
    return resp;
}