public void push(int x) {
    tmp.offer(x);
    while (!(q.isEmpty())) {
        final int e = ((int) (q.poll()));
        tmp.offer(e);
    } 
    java.util.Queue temp = tmp;
    tmp = q;
    q = temp;
}