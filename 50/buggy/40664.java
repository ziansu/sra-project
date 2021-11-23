@java.lang.Override
public void run() {
    java.lang.String value = null;
    try {
        value = response.body().string();
        dataHandler(url, value);
    } catch (java.io.IOException e) {
        dataLoadError(e);
    }
}