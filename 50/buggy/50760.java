public void setPage(edu.cmu.mat.scores.Page p) {
    page = p;
    page.getSystems().clear();
    edu.cmu.mat.lsd.logger.HCMPLogger.info(("Auto Generating Page " + (p.getIndex())));
    initDataArray();
    generate();
}