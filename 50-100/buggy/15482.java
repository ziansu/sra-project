@java.lang.Override
protected org.vaadin.tori.category.CategoryPresenter createPresenter() {
    final org.vaadin.tori.ToriApplication app = org.vaadin.tori.ToriApplication.getCurrent();
    final org.vaadin.tori.category.CategoryPresenter categoryPresenter = new org.vaadin.tori.category.CategoryPresenter(app.getDataSource(), app.getAuthorizationService());
    final com.vaadin.ui.ComponentContainer parent = ((com.vaadin.ui.ComponentContainer) (threadListing.getParent()));
    parent.replaceComponent(threadListing, (threadListing = new org.vaadin.tori.component.thread.ThreadListing(categoryPresenter)));
    newThreadButton1.setEnabled(categoryPresenter.userMayStartANewThread());
    newThreadButton2.setEnabled(categoryPresenter.userMayStartANewThread());
    return categoryPresenter;
}