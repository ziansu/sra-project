public void setPostList(com.akexorcist.sleepingforless.network.blogger.model.PostList postList) {
    if (((postList != null) && ((postList.getItems()) != null)) && ((postList.getItems().size()) > 0)) {
        adapter.setPostListItem(postList.getItems());
        adapter.setLoadMoreAvailable(false);
        showContentFound();
    }else {
        showContentNotFound();
    }
    hideLoading();
    hideUnavailableMessage();
    fabMenu.show();
}