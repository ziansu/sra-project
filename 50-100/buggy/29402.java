public static void main(java.lang.String[] args) {
    int totalNumberOfSequence = java.lang.Integer.parseInt(args[0]);
    int numberOfSequence = 0;
    Deques_and_Randomized_Queues.RandomizedQueue<java.lang.String> randomizedQueue = new Deques_and_Randomized_Queues.RandomizedQueue<java.lang.String>();
    while (numberOfSequence < totalNumberOfSequence) {
        randomizedQueue.enqueue(edu.princeton.cs.algs4.StdIn.readString());
        numberOfSequence++;
    } 
    while (numberOfSequence > 0) {
        edu.princeton.cs.algs4.StdOut.println(randomizedQueue.dequeue());
        numberOfSequence--;
    } 
}