@java.lang.Override
public boolean isDone() {
    boolean result = (getVotes().size()) == 1;
    return result;
}