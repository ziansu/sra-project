@java.lang.Override
public void onSuccess(T result) {
    if ((onSuccess) != null) {
        S newResult = onSuccess.invoke(result);
        if (hasCallback()) {
            outerCallback.onSuccess(newResult);
        }
    }
}