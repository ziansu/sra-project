@java.lang.Override
public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder) {
    int viewHolderPosition = viewHolder.getAdapterPosition();
    mModel.removeChild(viewHolderPosition);
    mSetsAdapter.notifyItemRemoved(viewHolderPosition);
    mItemRemovedSnackbar = android.support.design.widget.Snackbar.make(mSetsView, R.string.program_exercise_activity_set_deleted_message, Snackbar.LENGTH_INDEFINITE);
    mItemRemovedSnackbar.setAction(R.string.cancel_button_text, new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            mSetsAdapter.notifyItemInserted(mModel.restoreLastRemoved());
        }
    });
    mItemRemovedSnackbar.show();
}