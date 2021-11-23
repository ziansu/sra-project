@java.lang.Override
public java.lang.Void apply(org.jenkinsci.plugins.github.extension.GHEventsSubscriber subscriber) {
    org.apache.commons.lang3.Validate.notNull(subscriber);
    try {
        subscriber.onEvent(event, payload);
    } catch (java.lang.Throwable t) {
        org.jenkinsci.plugins.github.extension.GHEventsSubscriber.LOGGER.error("Subscriber {} failed to process {} hook, skipping...", subscriber.getClass().getName(), event, t);
    }
    return null;
}