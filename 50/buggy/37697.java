@java.lang.Override
public boolean isReady() {
    try {
        return (inputStream.available()) > (-1);
    } catch (java.io.IOException e) {
        return false;
    }
}