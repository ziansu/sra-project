static java.util.Optional<edu.cwru.eecs.clipper.Models.UserAccount> convertToUserAccount(org.bson.Document result) {
    java.util.Optional<edu.cwru.eecs.clipper.Models.UserAccount> userAccountOptional = java.util.Optional.empty();
    if ((result != null) && (!(result.getBoolean("isDeleted", false)))) {
        edu.cwru.eecs.clipper.Models.UserAccount userAccount = edu.cwru.eecs.clipper.DataManagers.UserAccountDataManager.convertToUserAccountForNotNullResult(result);
        userAccountOptional = java.util.Optional.of(userAccount);
    }
    return userAccountOptional;
}