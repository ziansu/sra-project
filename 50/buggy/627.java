@java.lang.Override
public void onSuccess(java.lang.Object[] result) {
    if ((onSuccess) != null) {
        S newResult = onSuccess.invoke(result);
        if (hasCallback()) {
            outerCallback.onSuccess(newResult);
        }
    }
}