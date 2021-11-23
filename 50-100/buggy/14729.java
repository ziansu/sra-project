@org.jboss.errai.ui.shared.api.annotations.EventHandler
private void onPostItemClick(com.google.gwt.event.dom.client.ClickEvent event) {
    if (!(title.isEditModeFocused())) {
        org.silverpeas.poc.api.navigation.NavigationProvider.get().goTo(org.silverpeas.poc.client.local.blog.post.BlogPostPage.class, com.google.common.collect.ImmutableMultimap.of("instanceId", getModel().getAppInstanceId(), "postId", getModel().getId()));
    }
}