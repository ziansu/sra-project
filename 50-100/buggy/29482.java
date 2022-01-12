@java.lang.Override
public void handle(org.fenixedu.cms.domain.Page page, org.fenixedu.cms.rendering.TemplateContext componentContext, org.fenixedu.cms.rendering.TemplateContext globalContext) {
    org.fenixedu.academic.domain.SchoolClass schoolClass = pt.ist.fenixframework.FenixFramework.getDomainObject(globalContext.getRequestContext()[1]);
    globalContext.put("defaultView", "agendaWeek");
    globalContext.put("eventsUrl", (((org.fenixedu.bennu.core.util.CoreConfiguration.getConfiguration().applicationUrl()) + "/api/fenixedu-learning/events/degree/class/") + (schoolClass.getExternalId())));
    globalContext.put("dayToShow", org.joda.time.format.ISODateTimeFormat.date().print(org.joda.time.LocalDate.now()));
}