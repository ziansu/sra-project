@java.lang.Override
public void handle(long timestamp) {
    if ((last_time) > 0) {
        dt = timestamp - (last_time);
        updateWorld(dt);
        drawAll();
    }
    last_time = timestamp;
}