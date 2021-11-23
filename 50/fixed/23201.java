private boolean shouldSchedule(hudson.model.Queue.Task task, argelbargel.jenkins.plugins.modules.ModuleAction module, java.util.List<hudson.model.Action> actions) {
    return (module == null) || (shouldSchedule(task, module.getPredicate(), actions));
}