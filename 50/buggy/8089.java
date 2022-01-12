@java.lang.Override
public void setExpandedState(boolean isExpanded, boolean animate) {
    com.wnafee.vector.MorphButton.MorphState indicatorState = (isExpanded) ? MorphButton.MorphState.END : MorphButton.MorphState.START;
    if ((mMorphButton.getState()) != indicatorState) {
        mMorphButton.setState(indicatorState, animate);
    }
}