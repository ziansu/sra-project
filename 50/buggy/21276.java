public void terminateSession() {
    flex.messaging.HttpFlexSession flexSession = ((flex.messaging.HttpFlexSession) (flex.messaging.FlexContext.getFlexSession()));
    flexSession.invalidate(true);
    org.springframework.security.core.context.SecurityContextHolder.clearContext();
    userContext.removeFromConnectedUsers(userContext.getCurrentUser());
}