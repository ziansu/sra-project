@java.lang.Override
public void onChange(RealmResults<io.realm.DynamicRealmObject> result) {
    if (!(subscriber.isUnsubscribed())) {
        subscriber.onNext(results);
    }
}