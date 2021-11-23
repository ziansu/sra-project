@java.lang.Override
public void onSuccess(T result) {
    wrapper.set(result, transaction);
}