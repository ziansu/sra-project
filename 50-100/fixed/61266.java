public static void main(java.lang.String[] args) {
    Queue<java.lang.String> q = new Queue<java.lang.String>();
    for (java.lang.String arg : args)
        q = q.enQueue(arg);
    
    while (!(q.isEmpty())) {
        java.lang.System.out.println(q.peek());
        q = q.deQueue();
    } 
}