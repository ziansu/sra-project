@java.lang.Override
public void handle(org.fenixedu.cms.domain.Page page, org.fenixedu.cms.rendering.TemplateContext componentContext, org.fenixedu.cms.rendering.TemplateContext globalContext) {
    org.fenixedu.academic.domain.ExecutionCourse executionCourse = ((org.fenixedu.learning.domain.executionCourse.ExecutionCourseSite) (page.getSite())).getExecutionCourse();
    globalContext.put("defaultView", "agendaWeek");
    globalContext.put("eventsUrl", (((org.fenixedu.bennu.core.util.CoreConfiguration.getConfiguration().applicationUrl()) + "/api/fenixedu-learning/events/executionCourse/") + (executionCourse.getExternalId())));
    globalContext.put("dayToShow", org.joda.time.format.ISODateTimeFormat.date().print(org.joda.time.LocalDate.now()));
}