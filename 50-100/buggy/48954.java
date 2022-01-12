@java.lang.Override
public void invoke(final java.io.OutputStream outputStream) {
    try {
        byte[] buffer = new byte[com.github.jishida.gradle.commons.util.NetUtils.BUFFER_SIZE];
        while (true) {
            final int count = inputStream.read(buffer);
            if (count == (-1))
                break;
            
            outputStream.write(buffer);
        } 
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}