@java.lang.Override
public void close() throws java.io.IOException {
    if (!(frameInfo.isFinished())) {
        writeEndMark();
        flush();
        frameInfo.finish();
    }
    super.close();
}