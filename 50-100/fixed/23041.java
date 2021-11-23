public static void main(java.lang.String[] args) throws java.lang.Exception {
    Learner.LearnerManager.logger.info(("Working Directory = " + (java.lang.System.getProperty("user.dir"))));
    if ((args.length) < 1) {
        Learner.LearnerManager.logger.info("No config file given!");
        java.lang.System.exit((-1));
    }
    Learner.LearnerManager lm = new Learner.LearnerManager(args[0]);
    lm.train();
    lm.readValidData();
    lm.readTestData();
    lm.compositeEvaluation();
}