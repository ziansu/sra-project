@java.lang.Override
public boolean isBranchTarget(soot.Unit u, soot.Unit succ) {
    assert getSuccsOf(u).contains(succ);
    if (!(u.branches()))
        return false;
    
    for (soot.UnitBox ub : u.getUnitBoxes()) {
        if ((ub.getUnit()) == succ)
            return true;
        
    }
    return false;
}