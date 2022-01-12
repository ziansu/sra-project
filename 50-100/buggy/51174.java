public static double calculateUserProbability(int total_attempts, int strategy_prob, int attempt, int user_attempts, double user_prob) {
    double StrategyProbability = user_prob;
    java.lang.System.out.println(StrategyProbability);
    int s = total_attempts + strategy_prob;
    double pi = 1.0 - StrategyProbability;
    return imu.recommender.jobs.UpdateStrategiesProbabilities.getBinomialDouble(((user_attempts - attempt) + (pi * s)), ((attempt + total_attempts) + strategy_prob));
}