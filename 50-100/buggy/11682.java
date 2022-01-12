@java.lang.Override
public void onNext(T i) {
    if (!(isUnsubscribed())) {
        boolean stop = (++(count)) >= (limit);
        child.onNext(i);
        if (stop && (!(completed))) {
            completed = true;
            try {
                child.onCompleted();
            } finally {
                unsubscribe();
            }
        }
    }
}