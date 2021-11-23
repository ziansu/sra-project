@java.lang.Override
public int compareTo(pathfinder.Algorithms.AStarNode o) {
    return ((int) (((toStart) + (toGoal)) - ((o.toStart) - (o.toGoal))));
}