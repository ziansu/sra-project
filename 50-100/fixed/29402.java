public static void main(java.lang.String[] args) {
    int totalNumberOfSequence = java.lang.Integer.parseInt(args[0]);
    int numberOfSequence = 0;
    Deques_and_Randomized_Queues.RandomizedQueue<java.lang.String> randomizedQueue = new Deques_and_Randomized_Queues.RandomizedQueue<java.lang.String>();
    while (!(edu.princeton.cs.algs4.StdIn.isEmpty())) {
        randomizedQueue.enqueue(edu.princeton.cs.algs4.StdIn.readString());
    } 
    while (numberOfSequence < totalNumberOfSequence) {
        edu.princeton.cs.algs4.StdOut.println(randomizedQueue.dequeue());
        numberOfSequence++;
    } 
}