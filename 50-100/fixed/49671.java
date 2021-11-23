public static synchronized org.codehaus.groovy.eclipse.refactoring.formatter.GroovyIndentationService get(org.eclipse.jdt.core.IJavaProject project) {
    if ((((org.codehaus.groovy.eclipse.refactoring.formatter.GroovyIndentationService.lastIndenter) != null) && (project != null)) && (!(project.equals(org.codehaus.groovy.eclipse.refactoring.formatter.GroovyIndentationService.lastIndenter.project)))) {
        org.codehaus.groovy.eclipse.refactoring.formatter.GroovyIndentationService.disposeLastImpl();
    }
    if ((org.codehaus.groovy.eclipse.refactoring.formatter.GroovyIndentationService.lastIndenter) == null) {
        org.codehaus.groovy.eclipse.refactoring.formatter.GroovyIndentationService.lastIndenter = new org.codehaus.groovy.eclipse.refactoring.formatter.GroovyIndentationService(project);
    }
    return org.codehaus.groovy.eclipse.refactoring.formatter.GroovyIndentationService.lastIndenter;
}