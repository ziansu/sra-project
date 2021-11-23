public boolean logout() {
    Account usersAccount = this.getAccount().get(0);
    JsonPersistency writeToJson = new JsonPersistency();
    writeToJson.toJson(usersAccount);
    this.LoggedIn = false;
    return true;
}