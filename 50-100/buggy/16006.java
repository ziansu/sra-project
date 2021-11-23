public static void main(java.lang.String[] args) {
    if ((args.length) != 1) {
        java.lang.System.err.println("Wrong number of args provided");
    }
    int numberOfThreads = 0;
    try {
        numberOfThreads = java.lang.Integer.parseInt(args[0]);
    } catch (java.lang.NumberFormatException e) {
        java.lang.System.err.println("Number of threads must be a number");
    }
    for (int i = 0; i < numberOfThreads; ++i) {
        new br.com.biancarosa.producer.Producer().start();
    }
}