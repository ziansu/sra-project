@java.lang.Override
public int compare(com.mk.entity.Player p1, com.mk.entity.Player p2) {
    int c = p1.getWaitingTime().compareTo(p2.getWaitingTime());
    if (c == 0) {
        c = p1.getUser().compareTo(p2.getUser());
    }
    return (order) == (com.mk.comparator.WaitingTimeComparator.Order.ASC) ? c : negate(c);
}