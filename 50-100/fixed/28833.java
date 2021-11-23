@org.springframework.context.annotation.Bean
@org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
@com.vaadin.spring.annotation.UIScope
public org.eclipse.hawkbit.ui.push.EventPushStrategy eventPushStrategy(final org.springframework.context.ConfigurableApplicationContext applicationContext, final java.util.concurrent.ScheduledExecutorService executorService, final org.vaadin.spring.events.EventBus.UIEventBus eventBus, final org.eclipse.hawkbit.ui.push.UIEventProvider eventProvider, final org.eclipse.hawkbit.ui.UiProperties uiProperties) {
    final org.eclipse.hawkbit.ui.push.DelayedEventBusPushStrategy delayedEventBusPushStrategy = new org.eclipse.hawkbit.ui.push.DelayedEventBusPushStrategy(executorService, eventBus, eventProvider, uiProperties.getEvent().getPush().getDelay());
    applicationContext.addApplicationListener(delayedEventBusPushStrategy);
    return delayedEventBusPushStrategy;
}