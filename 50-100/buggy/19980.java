public void onWriteEnd(long startTime, long writeResult, java.nio.ByteBuffer[] srcs, int offset, int length) {
    if ((logger) != null) {
        logger.info("{}:{}.write([{}],{},{}):{}", ((java.lang.System.currentTimeMillis()) - startTime), fci, srcs, offset, length, writeResult);
    }
}