@java.lang.Override
public void onNext(T i) {
    if (!(isUnsubscribed())) {
        if ((++(count)) >= (limit)) {
            completed = true;
            unsubscribe();
        }
        child.onNext(i);
        if (completed) {
            child.onCompleted();
        }
    }
}