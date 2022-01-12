public void clearSearchFields() {
    applicationName = "";
    flowName = "";
    flowPointName = "";
    transactionReferenceId = "";
    this.freeTextSearch = new com.erbjuder.logger.server.common.helper.FreeTextSearchController();
    this.search();
}