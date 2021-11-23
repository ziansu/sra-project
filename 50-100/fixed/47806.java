@java.lang.Override
public int compareTo(java.lang.Object o) {
    com.snooker.model.SurvivorJoiner joiner = ((com.snooker.model.SurvivorJoiner) (o));
    int result = (this.getWin()) - (joiner.getWin());
    if (result > 0) {
        return -1;
    }
    if (result < 0) {
        return 1;
    }
    return -1;
}