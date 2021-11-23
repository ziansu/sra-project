@java.lang.Override
public boolean evaluate(ngdemo.domain.Subscription item) {
    return (item.getSubscriber().equals(subscriber)) && (subscribedJournals.add(item.getJournal()));
}