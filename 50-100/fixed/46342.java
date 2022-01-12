public com.talk2object.plum.view.web.WebPageView build(com.talk2object.plum.view._abstract.components.Component component, java.lang.String title, java.lang.String pushTopic) {
    templatePage = new com.talk2object.plum.view.web.WebTemplatePage(com.talk2object.plum.view.web.component.builder.WebViewBuilder.PAGE_FILE);
    webView = new com.talk2object.plum.view.web.WebPageView(templatePage.getDocument().clone(), pushTopic);
    com.talk2object.plum.view.web.component.WebComponent root = ((com.talk2object.plum.view.web.component.WebComponent) (component.accept(this)));
    webView.setRootContentWebComponent(root, title);
    webView.setStateChangeEventListener(stateChangeEventListener);
    return webView;
}