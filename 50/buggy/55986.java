protected void subscriptions(rx.Subscription subscription) {
    unsubscribe();
    this.subscriptions = new rx.subscriptions.CompositeSubscription();
    this.subscriptions.add(subscription);
}