public void terminateSession() {
    flex.messaging.HttpFlexSession flexSession = ((flex.messaging.HttpFlexSession) (flex.messaging.FlexContext.getFlexSession()));
    userContext.removeFromConnectedUsers(userContext.getCurrentUser());
    flexSession.invalidate(true);
    org.springframework.security.core.context.SecurityContextHolder.clearContext();
}