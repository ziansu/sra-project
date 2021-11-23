public java.lang.String PrintCard() {
    java.lang.String ids = getRequest().getParameter("scope");
    java.lang.String reportName = "/report/card_image.jasper";
    java.lang.String reportPath = (getSession().getServletContext().getRealPath("/")) + reportName;
    com.huivip.webapp.action.JasperPrint jp = scheduleManager.createJasperPrint(ids, reportPath);
    outputPdf(jp);
    com.huivip.util.cache.CacheUtil.flush((((SelectCourse.CACHEKEYS_PREFIX) + "$") + (SelectCourse.SELECTCOURSES_USER_PREFIX)), true);
    return null;
}