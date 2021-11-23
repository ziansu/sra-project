public void toggleSelection(int position) {
    if (mSelectedItems.contains(position)) {
        mSelectedItems.remove(mSelectedItems.indexOf(position));
    }else {
        mSelectedItems.add(position);
    }
    io.github.sdsstudios.ScoreKeeper.Adapters.SelectableAdapter.notifyItemChanged(position);
}