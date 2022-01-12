@java.lang.Override
public int compare(info.naiv.lab.java.jmt.infrastructure.ServiceConnection o1, info.naiv.lab.java.jmt.infrastructure.ServiceConnection o2) {
    int c = o1.getContainer().id().compareTo(o2.getContainer().id());
    if (c == 0) {
        c = java.lang.Integer.compare(o1.getPriority(), o2.getPriority());
        if (c == 0) {
            c = OrderComparator.INSTANCE.compare(o1, o2);
        }
    }
    return c;
}