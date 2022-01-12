private void configCommentsSection() {
    this.commentsRecyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.comments_list)));
    this.commentsAdapter = new com.tdp2.tripplanner.attractionDetailActivityExtras.CommentsAdapter();
    commentsRecyclerView.setAdapter(this.commentsAdapter);
    android.support.v7.widget.LinearLayoutManager linearLayoutManager = new android.support.v7.widget.LinearLayoutManager(this);
    commentsRecyclerView.setLayoutManager(linearLayoutManager);
}