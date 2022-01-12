@java.lang.Override
public void handle(org.fenixedu.cms.domain.Page page, org.fenixedu.cms.rendering.TemplateContext componentContext, org.fenixedu.cms.rendering.TemplateContext globalContext) {
    org.fenixedu.academic.domain.Degree degree = degree(page);
    globalContext.put("defaultView", "month");
    globalContext.put("eventsUrl", (((org.fenixedu.bennu.core.util.CoreConfiguration.getConfiguration().applicationUrl()) + "/api/fenixedu-learning/events/degree/evaluations/") + (degree.getExternalId())));
}