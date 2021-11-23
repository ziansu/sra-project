@java.lang.Override
public void resetBuffer() {
    super.resetBuffer();
    bufferedFacadServletOutputStream.resetBuffer();
    bufferedFacadPrintWriter.resetBuffer();
}