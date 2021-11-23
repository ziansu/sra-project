public void decision(gov.nasa.jpf.vm.ThreadInfo ti, gov.nasa.jpf.vm.Instruction inst, int chosenIdx, starlib.formula.Formula[] constraints) {
    if ((current.childrend) == null) {
        int length = constraints.length;
        current.childrend = new costar.constrainsts.CoStarNode[length];
        for (int i = 0; i < length; i++) {
            current.childrend[i] = new costar.constrainsts.CoStarNode(current, null, constraints[i], inst, false);
        }
    }
    current.childrend[chosenIdx].hasVisited = true;
    current = current.childrend[chosenIdx];
}