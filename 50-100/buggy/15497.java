@org.springframework.web.bind.annotation.RequestMapping(value = "/getfunctionsbyfundidanddepartmentid", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String getAllFunctionsByFundIdAndDepartmentId(final org.springframework.ui.Model model, @org.springframework.web.bind.annotation.RequestParam(value = "fundId")
final java.lang.Integer fundId, @org.springframework.web.bind.annotation.RequestParam(value = "departmentId")
final java.lang.Long departmentId) throws java.io.IOException, java.lang.NumberFormatException, org.codehaus.jackson.JsonGenerationException, org.codehaus.jackson.map.JsonMappingException, org.egov.infra.exception.ApplicationException {
    final java.util.List<org.egov.commons.CFunction> functions = budgetDetailsHibernateDAO.getFunctionsByFundAndDepartment(fundId, departmentId);
    final java.lang.String jsonResponse = toJSONFunction(functions);
    return jsonResponse;
}