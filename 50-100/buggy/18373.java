@java.lang.Override
public boolean insert(final int index, E e) {
    boolean result = false;
    if (index == 0) {
        prepend(e);
        result = true;
    }else {
        me.algoli.list.LinkedList.Node runner = nodeAt(index);
        if (runner != null) {
            runner.append(me.algoli.list.LinkedList.Node.create(e));
            result = true;
        }
    }
    return result;
}