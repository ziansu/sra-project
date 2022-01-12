@org.junit.Test
public void testLogin() {
    org.joda.time.DateTime dt = org.joda.time.DateTime.parse("2016-04-12");
    java.util.List<pula.sys.domains.TimeCourseOrderUsage> usages = pula.sys.app.ReportController.readCourseUsage(usageDao, "文峰店", dt.toDate());
    java.lang.System.out.print(usages.size());
    java.lang.System.out.println(usages);
}