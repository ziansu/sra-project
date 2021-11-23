public ogame.utility.Resource getDeficit(ogame.utility.Resource goal) {
    return goal.subtract(this).removeNegative();
}