@java.lang.Override
public void onSuccess(T result) {
    super.onSuccess(result);
    wrapper.set(result, transaction);
}