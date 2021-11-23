private void process() {
    java.lang.System.out.println("Creating array...");
    int[] arr = createArray(ThreadApp.ARRAY_SIZE);
    java.lang.System.out.println("Linear sum...");
    java.lang.System.out.println(("LinearSum = " + (linearSum(arr))));
    java.lang.System.out.println("Thread sum...");
    java.lang.System.out.println(("ThreadSum = " + (sum(arr, ThreadApp.NUM_THREADS))));
}