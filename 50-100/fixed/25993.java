@java.lang.Override
public void stop() throws java.lang.Exception {
    if ((input) != null) {
        try {
            input.close();
            input = null;
            connection = null;
            url = null;
            if ((decoded) != null) {
                cvReleaseImage(decoded);
            }
        } catch (java.io.IOException e) {
            throw new java.lang.Exception(e.getMessage(), e);
        }
    }
}