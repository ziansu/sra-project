@java.lang.Override
public boolean supports(java.lang.Class<?> arg0) {
    return (arg0.isAssignableFrom(edu.asu.spring.quadriga.domain.impl.workbench.Project.class)) || (arg0.isAssignableFrom(edu.asu.spring.quadriga.domain.impl.passthroughproject.PassThroughProject.class));
}