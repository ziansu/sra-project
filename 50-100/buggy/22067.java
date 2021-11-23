public void onModuleLoad() {
    com.google.gwt.core.client.GWT.setUncaughtExceptionHandler(new com.google.gwt.core.client.GWT.UncaughtExceptionHandler() {
        @java.lang.Override
        public void onUncaughtException(java.lang.Throwable e) {
            rosa.pageturner.client.util.Console.log(("An unexpected error has occurred.\n" + (e.getMessage())));
        }
    });
    rosa.pageturner.client.model.Book fakeBook = fakeBook();
    final rosa.pageturner.client.viewers.FsiPageTurner pageTurner = new rosa.pageturner.client.viewers.FsiPageTurner(fakeBook, fakeBook.getPagesList().split(","), 400, 500);
    pageTurner.setDebug(false);
    com.google.gwt.user.client.ui.RootPanel.get().add(pageTurner);
}