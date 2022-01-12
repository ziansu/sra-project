public int samplesAvailableToEncode() {
    int available = 0;
    int channels = streamConfig.getChannelCount();
    for (net.sourceforge.javaflacencoder.BlockEncodeRequest ber : preparedRequests) {
        int[] block = ber.samples;
        available += (block.length) / channels;
    }
    available += unfilledRequest.count;
    return available;
}