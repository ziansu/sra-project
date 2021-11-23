public static void showNotifications(android.content.Context context, java.util.List<fforganizer.data.events.UserEvent> events) {
    fforganizer.notifications.NotifyMaster.clearNotifications(context);
    for (fforganizer.data.events.UserEvent event : events)
        if (((event.getDecision().getVote()) != (fforganizer.data.decisions.DecisionType.POSITIV)) && ((event.getDecision().getVote()) != (fforganizer.data.decisions.DecisionType.NEGATIV)))
            fforganizer.notifications.NotifyMaster.createNotifications(event);
        
    
}