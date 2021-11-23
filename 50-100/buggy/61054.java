private void triggerChannel(java.lang.String ch) {
    int channel = (java.lang.Integer.parseInt(ch)) - 1;
    if (channels[channel]) {
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