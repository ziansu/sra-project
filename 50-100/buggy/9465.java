@java.lang.Override
public javax.servlet.ServletInputStream getInputStream() throws java.io.IOException {
    synchronized(this) {
        if ((inputStream) == null) {
            if ((streamLimit) <= 0) {
                inputStream = new org.openrepose.commons.utils.io.BufferedServletInputStream(super.getInputStream());
            }else {
                inputStream = new org.openrepose.commons.utils.io.stream.ServletInputStreamWrapper(new org.openrepose.commons.utils.io.stream.LimitedReadInputStream(streamLimit, super.getInputStream()));
            }
        }
        return inputStream;
    }
}