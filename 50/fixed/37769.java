@java.lang.Override
public void handleError(int code, java.lang.String message) throws java.io.IOException {
    throw new java.io.IOException(((("HTTP Error " + code) + " was returned from the server: ") + message));
}