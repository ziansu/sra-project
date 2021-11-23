@java.lang.Override
public void onNext(T i) {
    if (!(isUnsubscribed())) {
        if ((++(count)) >= (limit)) {
            completed = true;
        }
        child.onNext(i);
        if (completed) {
            child.onCompleted();
            unsubscribe();
        }
    }
}