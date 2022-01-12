@java.lang.Override
public boolean canEnd(long time) {
    boolean itemCanEnd = super.canEnd(time);
    boolean containerCanEnd = (((items.size()) == 0) || ((items.peekLast().getEnd()) == (-1))) || ((items.peekLast().getEnd()) < time);
    return itemCanEnd && containerCanEnd;
}