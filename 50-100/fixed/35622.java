com.github.a2g.core.action.BaseAction replaceDoDialogActionWithOnDialogTreeChain(com.github.a2g.core.action.BaseAction a) {
    if (a instanceof com.github.a2g.core.action.ActivateDialogTreeModeAction) {
        int branchId = ((com.github.a2g.core.action.ActivateDialogTreeModeAction) (a)).getBranchId();
        com.github.a2g.core.action.DialogChainableAction d = createDialogChainRootAction();
        com.github.a2g.core.action.DialogChainEndAction b = this.sceneHandlers.onDialogTree(proxyForGameScene, d, branchId);
        d.setParent(a);
        return b;
    }
    return a;
}