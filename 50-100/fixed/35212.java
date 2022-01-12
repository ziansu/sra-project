public int getAbs(int lineNumber) throws java.io.IOException {
    int toSkip = lineNumber * (-1);
    for (int i = 0; i < toSkip; i++) {
        read();
    }
    int numberOfTimestampsFromStart = 0;
    com.google.common.base.Optional<hudson.plugins.timestamper.Timestamp> timestamp;
    do {
        timestamp = read();
        numberOfTimestampsFromStart++;
    } while (timestamp.isPresent() );
    numberOfTimestampsFromStart--;
    return numberOfTimestampsFromStart;
}