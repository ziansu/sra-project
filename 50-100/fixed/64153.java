protected void updateErrorState() {
    jetbrains.mps.ide.ui.tree.ErrorState state = ErrorState.NONE;
    if (propogateErrorUpwards()) {
        for (jetbrains.mps.ide.ui.tree.MPSTreeNode node : this) {
            state = state.combine(node.getAggregatedErrorState());
        }
    }
    myCombinedErrorState = state.combine(myErrorState);
    if ((getParent()) != null) {
        ((jetbrains.mps.ide.ui.tree.MPSTreeNode) (getParent())).updateErrorState();
    }
}