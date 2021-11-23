private void setTimeout(long timeout) {
    if (timeout != 0) {
        endTime = timeout - (org.ggp.base.player.gamer.statemachine.sample.MinimaxGamer.TIME_BUFFER);
    }else {
        endTime = 0;
    }
}