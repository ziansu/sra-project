@java.lang.Override
public void resetBuffer() {
    if ((bufferedFacadServletOutputStream) != null) {
        bufferedFacadServletOutputStream.resetBuffer();
    }
    if ((bufferedFacadPrintWriter) != null) {
        bufferedFacadPrintWriter.resetBuffer();
    }
}