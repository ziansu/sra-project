public void imitation(double hValue, int realizeCount, simaks.disorder.view.AbstractSimaksPage page) {
    view.clearDisorderResultTable();
    imitationThread = new java.lang.Thread(() -> {
        view.enabledPages(false, page);
        disoderImitation.imitation(hValue, realizeCount, isDisorderMode(), false);
        view.enabledPages(true, page);
        view.reverseImitationButtonTitle(((simaks.disorder.view.IImitaionPage) (page)));
    });
    imitationThread.setDaemon(true);
    imitationThread.start();
}