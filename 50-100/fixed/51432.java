public void go() {
    if (dataContainer.getOffersmap().isEmpty()) {
        downloadPremiumCars();
    }
    if ((dataContainer.getTotalCount()) < 1) {
        dataContainer.setPage(1);
    }
    dataContainer.setTotalCount(dataFacade.getPagesTotalCount());
    for (int i = dataContainer.getPage(); i <= (dataContainer.getTotalCount()); i++) {
        downloadNormalCars(i);
    }
}