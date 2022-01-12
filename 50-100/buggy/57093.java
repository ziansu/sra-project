private boolean doWorkTreePlan(com.custommods.ai.WorkTreePlan plan, com.custommods.ai.AIinventory inve, com.custommods.ai.AIWorld world) {
    boolean succeded = true;
    for (int i = (plan.childrenLenght()) - 1; i >= 0; i--) {
        succeded = succeded && (doWorkTreePlan(plan.getChild(i), inve, world));
    }
    succeded = succeded && (doNodeInWorkTree(plan.getTodo(), plan.getType(), inve, world));
    return succeded;
}