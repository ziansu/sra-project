@java.lang.Override
public void onChange(io.realm.DynamicRealmObject object) {
    if (!(subscriber.isUnsubscribed())) {
        subscriber.onNext(object);
    }
}