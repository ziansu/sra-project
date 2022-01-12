@com.squareup.otto.Subscribe
public void onInternalLinkClicked(com.ayuget.redface.ui.event.InternalLinkClickedEvent event) {
    com.ayuget.redface.ui.fragment.TopicFragment topicFragment = ((com.ayuget.redface.ui.fragment.TopicFragment) (getSupportFragmentManager().findFragmentByTag(com.ayuget.redface.ui.activity.TopicsActivity.TOPIC_FRAGMENT_TAG)));
    if (((topicFragment != null) && ((event.getTopic()) == (topicFragment.getTopic()))) && ((event.getPage()) == (topicFragment.getCurrentPage()))) {
        topicFragment.setCurrentPagePosition(event.getPagePosition());
    }
}