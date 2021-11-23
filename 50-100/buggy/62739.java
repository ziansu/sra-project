public java.lang.String remove(final spark.Request req) throws java.lang.Exception {
    final java.lang.String id = req.params(":id");
    this.userService.removeUser(id);
    this.logger.info((("[REMOVE] User " + id) + " removed"));
    return prettyPrint(new response.ResponseMessage((("User " + id) + " removed!!"), 200));
}