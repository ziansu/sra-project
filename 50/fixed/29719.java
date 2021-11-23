private com.wikia.webdriver.elements.mercury.components.discussions.desktop.Promoting findPromoting() {
    com.wikia.webdriver.elements.mercury.pages.discussions.PostsListPage page = new com.wikia.webdriver.elements.mercury.pages.discussions.PostsListPage().open();
    return page.getPromoting();
}