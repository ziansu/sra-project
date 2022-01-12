private void processMonitoringAfterEvent(final org.aspectj.lang.ProceedingJoinPoint currentJoinPoint, final java.lang.Object returnValue, final java.nio.ByteBuffer buffer) {
    final java.lang.String className = getJoinPointClassName(currentJoinPoint);
    final java.lang.Object[] classArgs = getJoinPointArguments(currentJoinPoint);
    final java.lang.String stringClassArgs = convertJoinpointArgsToString(classArgs);
    java.lang.String formattedReturnValue = extractJoinPointReturnValue(className, returnValue);
    if (formattedReturnValue == null) {
        formattedReturnValue = "";
    }
    buffer.putInt(explorviz.live_trace_processing.main.MonitoringStringRegistry.getIdForString(formattedReturnValue));
}