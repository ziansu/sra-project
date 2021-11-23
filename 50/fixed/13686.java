public void updatePosts(android.support.v7.widget.RecyclerView.Adapter adapterToNotify) {
    com.theratio.utilities.Post.updatePostsByUserID(this.id, this.posts, adapterToNotify, true);
}