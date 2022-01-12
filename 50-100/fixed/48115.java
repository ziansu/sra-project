public static void main(java.lang.String[] args) {
    boolean testing;
    if (((args.length) == 0) || (!(args[0].equals('1')))) {
        testing = false;
    }else {
        testing = true;
    }
    assignment2.Game g = new assignment2.Game(true);
    java.lang.System.out.println("Welcome to Mastermind.");
    g.runGame();
}