@java.lang.Override
public void onClick(android.view.View v) {
    comment.voteOn(false, new com.sdeli.imgurian.gallery.Comment.CommentCallback() {
        @java.lang.Override
        public void success() {
            notifyItemChanged(position);
        }

        @java.lang.Override
        public void failure(java.lang.String failure) {
            android.util.Log.d(com.sdeli.imgurian.adapters.RecyclerAdapter.TAG, failure);
            android.widget.Toast.makeText(context, failure, Toast.LENGTH_SHORT).show();
            notifyItemChanged(position);
        }
    });
    notifyItemChanged(position);
}