public ogame.utility.Resource getDeficit(ogame.utility.Resource goal) {
    return goal.removeNegative().subtract(this.removeNegative()).removeNegative();
}