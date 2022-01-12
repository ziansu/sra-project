@java.lang.Override
public void onClick(android.view.View view) {
    if ((expandedIndex) != (-1)) {
        this.getAdapter().expandContractItem(((grinnell.appdev.edu.lyles.ItemAdapter.ViewHolder) (mRecyclerView.findViewHolderForAdapterPosition(expandedIndex))));
    }
    this.getAdapter().expandContractItem(this);
    expandedIndex = ((expandedIndex) == (this.getAdapterPosition())) ? -1 : this.getAdapterPosition();
}