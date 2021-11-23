private void triggerChannel(java.lang.String ch) {
    int channel = (java.lang.Integer.parseInt(ch)) - 1;
    if (channel <= 7) {
        if (channels[channel]) {
            channel = channel + 1;
            if ((channel % 2) == 1) {
                if (waitingQueue.isEmpty()) {
                    return ;
                }
                startRacer();
            }else {
                if (racingQueue.isEmpty()) {
                    return ;
                }
                finishRacer();
            }
        }
    }
}