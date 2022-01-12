@java.lang.Override
public void process(java.io.OutputStream outputStream) throws java.io.IOException {
    org.apache.commons.io.IOUtils.write(result.result, outputStream, "UTF-8");
}