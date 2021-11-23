@java.lang.Override
public void run() {
    m_StopExecution = false;
    while (!(m_StopExecution)) {
        de.zabuza.sparkle.webdriver.event.IDelayableEvent event = m_EventQueue.poll();
        try {
            if (event != null) {
                event.execute();
                if (m_EventQueue.isEmpty()) {
                    m_AllEventsExecuted = true;
                }
                java.lang.Thread.sleep(getRandomDelay());
            }
            java.lang.Thread.sleep(de.zabuza.sparkle.webdriver.DelayedEventExecutor.STANDARD_DELAY);
        } catch (java.lang.InterruptedException e) {
            if (!(m_StopExecution)) {
                java.lang.System.err.println(ErrorMessages.DELAYED_EVENT_EXECUTOR_INTERRUPTED);
            }
        }
    } 
}