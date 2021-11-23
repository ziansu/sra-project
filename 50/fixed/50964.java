private long waitForNextFrame(long frame_start_time) {
    long how_long_we_took = (input.timeNow()) - frame_start_time;
    long wait_time = (rabbitescape.render.gameloop.GameLoop.frame_time_ms) - how_long_we_took;
    input.waitMs(wait_time);
    return input.timeNow();
}