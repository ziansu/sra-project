@java.lang.Override
public void start(long time) {
    if ((curStart) < (competitors.size())) {
        competitors.get(curStart).start(time);
        (curStart)++;
    }
}