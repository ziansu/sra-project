@java.lang.Override
public void onNext(T o) {
    if (!(successSent)) {
        successSent = true;
        success();
    }
}