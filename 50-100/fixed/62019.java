public static double evaluate(pokersquares.environment.Board board) {
    double evaluation = 0;
    for (int i = 0; i < 5; ++i) {
        evaluation += pokersquares.evaluations.PatternPolicy.evaluate(board.hands.get(i));
        evaluation += pokersquares.evaluations.PatternPolicy.evaluate(board.hands.get((i + 5)));
    }
    return evaluation;
}