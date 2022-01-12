public java.lang.String PrintCard() {
    java.lang.String ids = getRequest().getParameter("scope");
    java.lang.String reportPath = getSession().getServletContext().getRealPath("/");
    java.lang.String reportName = "/report/card_image.jasper";
    com.huivip.webapp.action.JasperPrint jp = scheduleManager.createJasperPrint(ids, reportPath, reportName);
    outputPdf(jp);
    com.huivip.util.cache.CacheUtil.flush((((SelectCourse.CACHEKEYS_PREFIX) + "$") + (SelectCourse.SELECTCOURSES_USER_PREFIX)), true);
    return null;
}