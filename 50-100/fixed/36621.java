@java.lang.Override
protected void onTick() {
    if (((constraints.size()) > 0) && ((theta.size()) == (constraints.size()))) {
        utils.Position nextPos = computeNextPosition(theta);
        if (!(atConvergence(nextPos)))
            target = nextPos;
        
    }
}