@java.lang.Override
public int compare(cn.nukkit.level.PriorityObject o1, cn.nukkit.level.PriorityObject o2) {
    return (o1.priority) > (o2.priority) ? 1 : (o1.priority) == (o2.priority) ? 0 : -1;
}