@java.lang.Override
protected boolean onViewClicked(final android.view.View myView) {
    com.ameron32.apps.tapnotes.v2.ui.mc_adapter.ProgramAdapter.ChildViewHolder h = null;
    if ((myView.getTag()) instanceof com.ameron32.apps.tapnotes.v2.ui.mc_adapter.ProgramAdapter.ChildViewHolder)
        h = ((com.ameron32.apps.tapnotes.v2.ui.mc_adapter.ProgramAdapter.ChildViewHolder) (myView.getTag()));
    
    if (h != null) {
        mAdapter.talkClicked(h.item);
    }
    if ((myView.getParent()) instanceof com.ameron32.apps.tapnotes.v2.ui.mc_adapter.ProgramRecycler) {
        ((com.ameron32.apps.tapnotes.v2.ui.mc_adapter.ProgramRecycler) (myView.getParent())).itemClicked(myView);
    }
    return false;
}