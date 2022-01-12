public boolean updateComment(int id, java.lang.String message) {
    return net.somethingdreadful.MAL.account.AccountService.isMAL() ? malApi.updateComment(id, message) : alApi.updateComment(id, message);
}