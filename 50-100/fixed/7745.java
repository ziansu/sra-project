public void emit(T record) throws java.io.IOException, java.lang.InterruptedException {
    for (int targetChannel : channelSelector.selectChannels(record, numChannels)) {
        if ((random.nextInt(100)) < (targetPartition.getChannelNonDropProbability(targetChannel))) {
            sendToTarget(record, targetChannel);
        }
    }
}