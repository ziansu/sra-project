public static void main(java.lang.String[] args) {
    RandomizedQueue<java.lang.Integer> rq = new RandomizedQueue();
    rq.enqueue(18);
    java.lang.System.out.println(rq.size());
    rq.enqueue(41);
    rq.enqueue(11);
    java.lang.System.out.println(rq.dequeue());
    java.lang.System.out.println(rq.dequeue());
    rq.enqueue(46);
}