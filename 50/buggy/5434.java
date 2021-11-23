@java.lang.Override
public void onComplete() {
    try {
        writer.close();
    } catch (java.io.IOException e) {
        onError(e);
    }
}