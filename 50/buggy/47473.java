public synchronized com.kenai.redminenb.query.RedmineQueryController getController() {
    if ((queryController) == null) {
        queryController = new com.kenai.redminenb.query.RedmineQueryController(repository, this);
    }
    return queryController;
}