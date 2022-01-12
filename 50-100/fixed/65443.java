public static models.NotificationEvent forNewIssue(models.Issue issue, models.User author) {
    models.NotificationEvent notiEvent = models.NotificationEvent.createFrom(author, issue);
    notiEvent.title = models.NotificationEvent.formatNewTitle(issue);
    notiEvent.receivers = models.NotificationEvent.getReceivers(issue, author);
    notiEvent.eventType = NEW_ISSUE;
    notiEvent.oldValue = null;
    notiEvent.newValue = issue.body;
    return notiEvent;
}