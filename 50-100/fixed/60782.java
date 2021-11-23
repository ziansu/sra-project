public void train(int iterations) {
    for (int i = 0; i < iterations; i++) {
        double[] strategy = getStrategy(RPSTrainer.PLAYER_1);
        double[] oppStrategy = getStrategy(RPSTrainer.PLAYER_2);
        int myAction = getAction(strategy);
        int otherAction = getAction(oppStrategy);
        regretSum = getRegretSum(otherAction, myAction, regretSum, RPSTrainer.PLAYER_1);
        regretSum = getRegretSum(myAction, otherAction, regretSum, RPSTrainer.PLAYER_2);
    }
}