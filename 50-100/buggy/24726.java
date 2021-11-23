public static void main(java.lang.String[] args) {
    if ((args.length) != 1) {
        java.lang.System.err.println("Error: Incorrect number of command line arguments");
        java.lang.System.exit((-1));
    }
    java.lang.String[] transactions = assignment3.A3Driver.processLinesInFile(args[0]);
    java.util.ArrayList<assignment3.Item> shoppingCart = new java.util.ArrayList<assignment3.Item>();
    assignment3.A3Driver.processTransactions(transactions, shoppingCart);
}