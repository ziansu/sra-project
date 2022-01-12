private static void testOneSetup(int whiteLVL, int blackLVL, int howManyBoards) {
    long start = java.lang.System.currentTimeMillis();
    java.lang.System.out.println(OptimizationMain.getEstimationOfProcessLength((2 * howManyBoards), whiteLVL, blackLVL));
    MatchMaker referee = new MatchMaker(whiteLVL, AI.AI.bestParameters, blackLVL, AI.AI.bestParameters, true, true);
    java.lang.System.out.println(referee.calculate(howManyBoards));
    java.lang.System.out.println(OptimizationMain.howLongItTook(start, (2 * howManyBoards)));
}