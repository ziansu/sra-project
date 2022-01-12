public void resetChannelMax(int givenMax) {
    maxChannel = 0;
    if (givenMax > 0) {
        maxChannel = givenMax - 1;
    }else {
        maxChannel = 0;
    }
    if ((currentChannel) > (maxChannel)) {
        currentChannel = maxChannel;
    }
}