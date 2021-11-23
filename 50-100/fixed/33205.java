public static void main(java.lang.String[] args) {
    int k = java.lang.Integer.parseInt(args[0]);
    RandomizedQueue<java.lang.String> data = new RandomizedQueue<java.lang.String>();
    while (!(StdIn.isEmpty()))
        data.enqueue(StdIn.readString());
    
    for (int i = 0; i < k; i++)
        java.lang.System.out.println(data.dequeue());
    
}