@java.lang.Override
public int compareTo(pathfinder.Algorithms.AStarNode o) {
    return ((int) (((o.toStart) - (o.toGoal)) - ((toStart) + (toGoal))));
}