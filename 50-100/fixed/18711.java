@java.lang.Override
public int compare(com.mk.entity.Player p1, com.mk.entity.Player p2) {
    int c = ((order) == (com.mk.comparator.WaitingTimeComparator.Order.ASC)) ? p1.getWaitingTime().compareTo(p2.getWaitingTime()) : p2.getWaitingTime().compareTo(p1.getWaitingTime());
    return c == 0 ? p1.getUser().compareTo(p2.getUser()) : c;
}