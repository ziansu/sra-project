public static void main(java.lang.String[] args) {
    RandomizedQueue<java.lang.String> data = new RandomizedQueue<java.lang.String>();
    while (!(StdIn.isEmpty()))
        data.enqueue(StdIn.readString());
    
    for (int i = 0; i < 3; i++)
        java.lang.System.out.println(data.dequeue());
    
}