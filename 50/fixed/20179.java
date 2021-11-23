@java.lang.Override
public boolean isGoalMet(org.encog.ml.graph.BasicPath path) {
    if ((path.getDestinationNode()) == (goalDestination)) {
        return true;
    }
    return false;
}