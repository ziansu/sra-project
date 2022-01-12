public static void main(java.lang.String[] args) throws java.lang.InterruptedException {
    int[] array = helpers.Utils.fillArray(10);
    helpers.Utils.shuffleArray(array);
    java.lang.System.out.println("Before sort: ");
    helpers.Utils.printArray(array);
    helpers.Utils.shuffleArray(array);
    Main.twoThreads(array);
    Main.fourThreads(array);
    java.lang.System.out.println("After sort: ");
    helpers.Utils.printArray(array);
}