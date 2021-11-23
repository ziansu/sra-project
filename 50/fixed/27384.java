private void callback(boolean success) {
    if (success) {
        if ((onComplete) != null) {
            onComplete.onComplete();
        }
    }else {
        if ((onFail) != null) {
            onFail.onFail();
        }
    }
}