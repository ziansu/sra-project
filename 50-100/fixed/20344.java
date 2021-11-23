@java.lang.SuppressWarnings(value = "unchecked")
jenkins.plugins.slack.FineGrainedNotifier getNotifier(hudson.model.AbstractProject project) {
    java.util.Map<hudson.model.Descriptor<hudson.tasks.Publisher>, hudson.tasks.Publisher> map = project.getPublishersList().toMap();
    for (hudson.tasks.Publisher publisher : map.values()) {
        if (publisher instanceof jenkins.plugins.slack.SlackNotifier) {
            ((jenkins.plugins.slack.SlackNotifier) (publisher)).update();
            return new jenkins.plugins.slack.ActiveNotifier(((jenkins.plugins.slack.SlackNotifier) (publisher)));
        }
    }
    return new jenkins.plugins.slack.DisabledNotifier();
}