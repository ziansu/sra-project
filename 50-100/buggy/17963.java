@java.lang.Override
public int egreedyActionSelection(competition.richmario.StateAction sa) {
    if ((util.RNG.randomDouble()) < (phi)) {
        return policyReuse(sa);
    }else
        if ((util.RNG.randomDouble()) < (epsilon)) {
            return util.RNG.randomInt(getNumActions());
        }else {
            return greedyActionSelection(sa);
        }
    
}