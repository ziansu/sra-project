@java.lang.Override
public boolean evaluate(ngdemo.domain.Subscription item) {
    subscribedJournals.add(item.getJournal());
    return item.getSubscriber().equals(subscriber);
}