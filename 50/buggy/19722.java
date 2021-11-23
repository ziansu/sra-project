@java.lang.Override
public void finishOutput() {
    try {
        fileChannel.force(true);
    } catch (final java.io.IOException ioe) {
        if (jcl.streams.FileStreamStruct.LOGGER.isWarnEnabled()) {
            jcl.streams.FileStreamStruct.LOGGER.warn("Could not finish stream output.", ioe);
        }
    }
}