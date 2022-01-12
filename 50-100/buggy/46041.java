public static void simpleToy() {
    org.deeplearning4j.rl4j.util.DataManager manager = new org.deeplearning4j.rl4j.util.DataManager();
    org.deeplearning4j.rl4j.mdp.toy.SimpleToy mdp = new org.deeplearning4j.rl4j.mdp.toy.SimpleToy(20);
    org.deeplearning4j.rl4j.learning.Learning<org.deeplearning4j.rl4j.mdp.toy.SimpleToyState, java.lang.Integer, org.deeplearning4j.rl4j.space.DiscreteSpace, org.deeplearning4j.rl4j.network.dqn.IDQN> dql = new org.deeplearning4j.rl4j.learning.sync.qlearning.discrete.QLearningDiscreteDense<org.deeplearning4j.rl4j.mdp.toy.SimpleToyState>(mdp, org.deeplearning4j.rl4j.Toy.TOY_NET, org.deeplearning4j.rl4j.Toy.TOY_QL, manager);
    mdp.setFetchable(dql);
    dql.train();
    mdp.close();
}