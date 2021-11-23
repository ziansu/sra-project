@org.springframework.web.bind.annotation.ModelAttribute(value = "site")
private org.fenixedu.cms.domain.Site site(@org.springframework.web.bind.annotation.PathVariable
java.lang.String siteId) {
    org.fenixedu.learning.domain.executionCourse.ExecutionCourseSite site = pt.ist.fenixframework.FenixFramework.getDomainObject(siteId);
    if ((!(pt.ist.fenixframework.FenixFramework.isDomainObjectValid(site))) || ((site.getExecutionCourse().getProfessorshipForCurrentUser()) == null)) {
        throw org.fenixedu.bennu.core.domain.exceptions.BennuCoreDomainException.resourceNotFound(siteId);
    }
    return site;
}