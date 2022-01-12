public void removePlayer(int position) {
    mBackupPosition = position;
    mBackupPlayer = mPlayerArray().get(position);
    mPlayerListAdapterListener.onPlayerRemove(position);
    notifyDataSetChanged();
    if ((mRelativeLayout) != null) {
        mSnackBar = android.support.design.widget.Snackbar.make(mRelativeLayout, "Player removed.", Snackbar.LENGTH_LONG).setAction("Undo", undoPlayerClickListener);
        mSnackBar.show();
    }
}