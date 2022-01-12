@org.springframework.security.access.prepost.PreAuthorize(value = "hasRole('USER')")
@org.springframework.web.bind.annotation.RequestMapping(value = "print/{year}/{yearSeq}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public void report(@org.springframework.web.bind.annotation.PathVariable(value = "year")
java.lang.String year, @org.springframework.web.bind.annotation.PathVariable(value = "yearSeq")
java.lang.Long yearSeq, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception {
    try {
        java.lang.String userName = getPrincipal();
        com.rama.eva.model.TabtUserEntity user = userService.findById(userName);
        java.lang.String fullName = makeFullName(user);
        java.util.List<com.rama.eva.pojo.PdfReport002Bean> list = reportService.findForReport002(year, yearSeq);
        reportJsperTest(request, response, fullName, list);
    } catch (java.lang.Exception ex) {
        LOG.error(ex.getMessage(), ex);
        throw ex;
    }
}