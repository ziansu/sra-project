@java.lang.Override
public void activate(final org.cloudcoder.app.client.model.Session session, org.cloudcoder.app.shared.util.SubscriptionRegistrar subscriptionRegistrar) {
    session.subscribe(Session.Event.ADDED_OBJECT, this, subscriptionRegistrar);
    org.cloudcoder.app.shared.model.ProblemAndSubmissionReceipt[] problemAndSubmissionReceipts = session.get(org.cloudcoder.app.shared.model.ProblemAndSubmissionReceipt[].class);
    if (problemAndSubmissionReceipts != null) {
        loadData(problemAndSubmissionReceipts);
    }
}