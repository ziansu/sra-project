private boolean doWorkTreePlan(com.custommods.ai.WorkTreePlan plan, com.custommods.ai.AIinventory inve, com.custommods.ai.AIWorld world) {
    boolean succeded = true;
    for (int i = 0; i < (plan.childrenLenght()); i++) {
        succeded = succeded && (doWorkTreePlan(plan.getChild(i), inve, world));
    }
    succeded = succeded && (doNodeInWorkTree(plan.getTodo(), plan.getType(), inve, world));
    return succeded;
}