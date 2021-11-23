@java.lang.Override
public boolean offer(java.lang.Integer integer) {
    (size)++;
    if ((last) == null) {
        last = new ch1.point3.QueueViaCircularLL.Node(integer);
        last.next = last;
    }else {
        ch1.point3.QueueViaCircularLL.Node first = last.next;
        last.next = new ch1.point3.QueueViaCircularLL.Node(integer);
        last = last.next;
        last.next = first;
    }
    return true;
}