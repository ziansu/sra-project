@java.lang.Override
public void flushBuffer() throws java.io.IOException {
    try {
        response.flushBuffer();
    } catch (java.lang.NullPointerException ex) {
        handleException(ex);
    } catch (java.io.IOException ex) {
        handleException(ex);
        throw ex;
    }
}