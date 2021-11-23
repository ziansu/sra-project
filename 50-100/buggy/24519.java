public java.util.Collection<?> getActions() {
    java.util.List<io.jenkins.blueocean.rest.model.BlueActionProxy> actionProxies = new java.util.ArrayList<>();
    for (hudson.model.Action action : run.getAllActions()) {
        if (!(action.getClass().isAnnotationPresent(org.kohsuke.stapler.export.ExportedBean.class))) {
            continue;
        }
        actionProxies.add(new io.jenkins.blueocean.service.embedded.rest.ActionProxiesImpl(action, this));
    }
    return actionProxies;
}