public java.lang.String update(final spark.Request req) throws java.lang.Exception {
    this.userService.updateUser(req.body());
    this.logger.info("[UPDATE] User updated!");
    return prettyPrint(new response.ResponseMessage("User updated!!", 200));
}