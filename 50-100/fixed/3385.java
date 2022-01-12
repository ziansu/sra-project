@java.lang.Override
public void run() {
    java.lang.System.out.println();
    java.util.ArrayList<java.math.BigInteger> block = buildBlock(false);
    fibonacci.Console.printBlock(block, maxValue);
    if (((maxValue) != null) && ((term1.compareTo(maxValue)) >= 0)) {
        java.lang.System.out.println("Sequence completed.");
        stop();
    }
    java.lang.System.out.print(state.prompt());
}