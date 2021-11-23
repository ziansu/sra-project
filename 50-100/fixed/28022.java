public void onEvent(kz.voxpopuli.voxapplication.network.wrappers.comments.article.ArticleCommentsWrapper wrapper) {
    if ((wrapper.getArcticleComments().size()) > 0) {
        comments.addAll(wrapper.getArcticleComments());
        commentsAdapter.notifyDataSetChanged();
    }
    refreshLayout.setRefreshing(false);
}