@java.lang.Override
public void invoke(final java.io.OutputStream outputStream) {
    try {
        byte[] buffer = new byte[com.github.jishida.gradle.commons.util.NetUtils.BUFFER_SIZE];
        while (true) {
            final int size = inputStream.read(buffer, 0, com.github.jishida.gradle.commons.util.NetUtils.BUFFER_SIZE);
            if (size == (-1))
                break;
            
            outputStream.write(buffer, 0, size);
        } 
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}