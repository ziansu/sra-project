@java.lang.Override
public void handleError(int code, java.lang.String message) throws java.io.IOException {
    if (code > 0)
        throw new java.io.IOException(((("HTTP Error " + code) + " was returned from the server: ") + message));
    else
        throw new java.io.IOException("A non-HTTP error was returned from the server.");
    
}