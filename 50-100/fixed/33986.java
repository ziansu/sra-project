@com.squareup.otto.Subscribe
public void onScrollToPost(com.ayuget.redface.ui.event.ScrollToPostEvent event) {
    if (((event.getTopic().id()) == (topic.id())) && ((event.getPage()) == (currentPage))) {
        topicPageView.setPagePosition(event.getPagePosition());
    }
}