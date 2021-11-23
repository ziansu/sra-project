private boolean resolveProject(final sk.stuba.fiit.perconik.activity.listeners.resource.ResourceEventVisit visit, final org.eclipse.core.resources.IProject project) {
    switch (visit.input.type) {
        case sk.stuba.fiit.perconik.eclipse.core.resources.ResourceEventType.PRE_BUILD :
            this.process(sk.stuba.fiit.perconik.activity.listeners.resource.ProjectListener.Action.BUILD, visit, project);
            break;
        case sk.stuba.fiit.perconik.eclipse.core.resources.ResourceEventType.PRE_CLOSE :
            this.process(sk.stuba.fiit.perconik.activity.listeners.resource.ProjectListener.Action.CLOSE, visit, project);
            break;
        case sk.stuba.fiit.perconik.eclipse.core.resources.ResourceEventType.PRE_DELETE :
            this.process(sk.stuba.fiit.perconik.activity.listeners.resource.ProjectListener.Action.DELETE, visit, project);
            break;
        default :
    }
    return false;
}