public static void toyAsyncNstep() {
    org.deeplearning4j.rl4j.util.DataManager manager = new org.deeplearning4j.rl4j.util.DataManager();
    org.deeplearning4j.rl4j.mdp.toy.SimpleToy mdp = new org.deeplearning4j.rl4j.mdp.toy.SimpleToy(20);
    org.deeplearning4j.rl4j.learning.async.nstep.discrete.AsyncNStepQLearningDiscreteDense<org.deeplearning4j.rl4j.mdp.toy.SimpleToyState> dql = new org.deeplearning4j.rl4j.learning.async.nstep.discrete.AsyncNStepQLearningDiscreteDense(mdp, org.deeplearning4j.rl4j.Toy.TOY_NET, org.deeplearning4j.rl4j.Toy.TOY_ASYNC_QL, manager);
    mdp.setFetchable(dql);
    dql.train();
    mdp.close();
}