public static void main(java.lang.String[] args) {
    a02.RandomizedQueue rand = new a02.RandomizedQueue();
    for (java.lang.String s : args) {
        rand.enqueue(s);
    }
    java.lang.System.out.println(rand.dequeue());
}