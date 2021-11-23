@java.lang.Override
public void onNext(T o) {
    successSent = true;
    success();
}